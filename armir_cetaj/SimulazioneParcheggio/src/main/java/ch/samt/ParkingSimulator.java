package ch.samt;

import ch.samt.classes.Car;
import ch.samt.classes.Garage;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingSimulator {
    public static void main(String[] args) {
        ParkingSimulator simulator = new ParkingSimulator();
        ArrayList<String> cars = new ArrayList<String>();
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        Car car4 = new Car("car4");
        Car car5 = new Car("car5");
        Car car6 = new Car("car6");
        Car car7 = new Car("car7");
        Car car8 = new Car("car8");
        Car car9 = new Car("car9");
        Car car10 = new Car("car10");
        Car car11 = new Car("car11");
        Car car12 = new Car("car12");
        Car car13 = new Car("car13");
        Car car14 = new Car("car14");
        Car car15 = new Car("car15");
        Car car16 = new Car("car16");
        Car car17 = new Car("car17");
        Car car18 = new Car("car18");
        Car car19 = new Car("car19");
        Car car20 = new Car("car20");
        cars.add(car1.getName());
        cars.add(car2.getName());
        cars.add(car3.getName());
        cars.add(car4.getName());
        cars.add(car5.getName());
        cars.add(car6.getName());
        cars.add(car7.getName());
        cars.add(car8.getName());
        cars.add(car9.getName());
        cars.add(car10.getName());
        cars.add(car11.getName());
        cars.add(car12.getName());
        cars.add(car13.getName());
        cars.add(car14.getName());
        cars.add(car15.getName());
        cars.add(car16.getName());
        cars.add(car17.getName());
        cars.add(car18.getName());
        cars.add(car19.getName());
        cars.add(car20.getName());
        Garage garage = new Garage(new AtomicInteger(4), "ch.samt.classes.Garage");
        System.out.println("=== PARKING SIMULATOR SYSTEM ===");
        System.out.println(garage.getCars());
        System.out.println(garage.getCapacity());
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for(int i=0;i<3;i++) {
            for (String car : cars) {
                if(garage.isParked(car)) {
                    executor.submit(() -> System.out.println(garage.leaveCar(car)));
                }
                else {
                    executor.submit(() -> System.out.println(garage.parkCar(car)));
                }
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(garage.getCars());

    }
}
