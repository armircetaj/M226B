import ch.samt.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private static class TestCar extends Car {
        public TestCar(String name) {
            super(name);
        }

    }

    @Test
    void testGetName() {
        Car car1 = new TestCar("car1");
        assertEquals("car1", car1.getName());
    }
}
