package ch.samt.classes;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Garage {
    private String name;
    private CopyOnWriteArrayList<String> carlist;
    private AtomicInteger capacity;
    public Garage(AtomicInteger capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.carlist = new CopyOnWriteArrayList<>();
        Car car3 = new Car("car3");
        Car car6 = new Car("car6");
        Car car9 = new Car("car9");
        Car car12 = new Car("car12");
        Car car15 = new Car("car15");
        Car car18 = new Car("car18");
        this.carlist.add(car3.getName());
        this.carlist.add(car6.getName());
        this.carlist.add(car9.getName());
        this.carlist.add(car12.getName());
        this.carlist.add(car15.getName());
        this.carlist.add(car18.getName());
    }
    public int getCapacity() {
        return capacity.get();
    }
    public synchronized String parkCar(String car) {
        if(capacity.get() > 0) {
            carlist.add(car);
            capacity.decrementAndGet();
            return "L'auto " + car + " parcheggia in garage, posti liberi " + capacity.get();
        }
        else {
            return "L'auto " + car + " vorrebbe parcheggiare ma il garage è completamente occupato!";
        }
    }
    public synchronized String leaveCar(String car) {
        if(carlist.contains(car)) {
            carlist.remove(car);
            if(capacity.get() < 10) {
                capacity.incrementAndGet();
            }
            else {
                capacity.set(10);
            }
            return "L'auto " + car + " esce dal garage, posti liberi " + capacity.get();
        }
        else {
            return "L'auto " + car + " non è parcheggiata!!!!!!!!!!!!!!!!!!!!!!!"; // se esce questo nell'output vuol dire che ci sono race conditions
        }
    }
    public String getCars() {
        String cars = "Le auto che sono parcheggiate in garage sono:\n";
        for(int i = 0; i < carlist.size(); i++) {
            cars += carlist.get(i);
            cars += "\n";
        }
        return cars;
    }
    public synchronized boolean isParked(String car) {
        if(carlist.contains(car)) {
            return true;
        }
        else {
            return false;
        }
    }

}
