package ch.samt;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Garage {
    private String name;
    private ConcurrentHashMap<Integer, String> carlist;
    private CopyOnWriteArrayList<Integer> parkingspot;
    private AtomicInteger capacity;
    public Garage(AtomicInteger capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.carlist = new ConcurrentHashMap<>();
        Car car3 = new Car("car3");
        Car car6 = new Car("car6");
        Car car9 = new Car("car9");
        Car car12 = new Car("car12");
        Car car15 = new Car("car15");
        Car car18 = new Car("car18");
        this.carlist.put(1, car3.getName());
        this.carlist.put(2, car6.getName());
        this.carlist.put(3, car9.getName());
        this.carlist.put(4, car12.getName());
        this.carlist.put(5, car15.getName());
        this.carlist.put(6, car18.getName());
        parkingspot = new CopyOnWriteArrayList<>();
        this.parkingspot.add(7);
        this.parkingspot.add(8);
        this.parkingspot.add(9);
        this.parkingspot.add(10);

    }
    public int getCapacity() {
        return capacity.get();
    }
    public synchronized String parkCar(String car) {
        if(capacity.get() > 0) {
            int p = parkingspot.getFirst();
            carlist.put(p, car);
            capacity.decrementAndGet();
            return "L'auto " + car + " parcheggia in garage al posteggio " + p;
        }
        else {
            return "L'auto " + car + " vorrebbe parcheggiare ma il garage è completamente occupato!";
        }
    }
    public synchronized String leaveCar(String car) {
        if(carlist.contains(car)) {
            int p = carlist.getKey;
            carlist.remove(car);
            if(capacity.get() < 10) {
                capacity.incrementAndGet();
            }
            else {
                capacity.set(10);
            }
            return "L'auto " + car + " esce dal garage e lascia il posteggio " ;
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
