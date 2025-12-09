import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator c = new Calculator();
        int r = c.add(1, 1);
        assertEquals(r, 2);
    }
    @Test
    public void divisionTest() {
        Calculator c = new Calculator();
        int r = c.division(4, 0);
        assertEquals(r, 2);
    }
}
