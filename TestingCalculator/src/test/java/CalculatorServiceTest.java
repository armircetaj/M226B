import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void addAndMultiplyByTwo() {
        Calculator calc = new Calculator();
        int res = calc.add(1, 2) * 2;
        assertEquals(6, res);
    }
}
