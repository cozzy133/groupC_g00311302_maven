package ie.gmit;

// Adding in new information
public class Calculator {

    private double answer;

    public Calculator() {
        this.answer = 0;
    }

    public double add(double num1, double num2) { // This method will add two numbers and return result
        answer = num1 + num2;
        return answer; // returns result
    }

    public double subtract(double num1, double num2) { // This method will add two numbers and return result
        answer = num1 - num2;
        return answer; // returns result
    }

    public double multiply(double num1, double num2) { // This method will add two numbers and return result
        answer = num1 * num2;
        return answer; // returns result
    }

    public double divide(double num1, double num2) { // This method will add two numbers and return result
        answer = num1 / num2;
        return answer; // returns result
    }

    public double getAnswer() {
        return answer;
    }

}
