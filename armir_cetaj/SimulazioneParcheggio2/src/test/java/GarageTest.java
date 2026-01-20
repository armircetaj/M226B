import ch.samt.Car;
import ch.samt.Garage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class GarageTest {
    private static class TestGarage extends Garage {
        public TestGarage(AtomicInteger capacity, String name){
            super(capacity, name);
        }
    }

    @Test
    void testGetCapacity() {
        Garage garage = new TestGarage(new AtomicInteger(0), null);
        assertEquals(garage.getCapacity(), 0);
    }
    @Test
    void testParkCar() {
        Car car1 = new Car("car1");
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        garage.parkCar(car1.getName());
        assertEquals(garage.getCapacity(), 4);
    }
    @Test
    void testLeaveCar() {
        Car car1 = new Car("car1");
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        garage.parkCar(car1.getName());
        garage.leaveCar(car1.getName());
        assertEquals(garage.getCapacity(), 5);
    }
    @Test
    void testParkCarLimit() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Garage garage = new TestGarage(new AtomicInteger(1), null);
        garage.parkCar(car1.getName());
        assertEquals(garage.parkCar(car2.getName()), "L'auto car2 vorrebbe parcheggiare ma il garage è completamente occupato!");
    }
    @Test
    void testLeaveUnparkedCar() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        garage.parkCar(car1.getName());
        assertEquals(garage.leaveCar(car2.getName()), "L'auto car2 non è parcheggiata!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    void testIsParked() {
        Car car1 = new Car("car1");
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        garage.parkCar(car1.getName());
        assertEquals(garage.isParked(car1.getName()), true);
    }
    @Test
    void testIsNotParked() {
        Car car1 = new Car("car1");
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        assertEquals(garage.isParked(car1.getName()), false);
    }
    @Test
    void testGetCars() {
        Garage garage = new TestGarage(new AtomicInteger(5), null);
        assertEquals(garage.getCars(), "Le auto che sono parcheggiate in garage sono:\ncar3\ncar6\ncar9\ncar12\ncar15\ncar18\n");
    }

}
