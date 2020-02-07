package ie.gmit;

public class CalculatorProgram {
    public static void main(String[] args) {
    // This class tests the Calculator class
    Calculator calc = new Calculator();

    double result = calc.add(20, 20);
    if (result != 40) {
        System.out.println("Not good");
    } else {
        System.out.println("Good");
    }
    }
}
