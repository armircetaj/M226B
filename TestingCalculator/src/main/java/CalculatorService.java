public class CalculatorService {
    public int addAndMultiplyByTwo(int a, int b) {
        Calculator calc = new Calculator();
        return calc.add(a, b) * 2;
    }
}
