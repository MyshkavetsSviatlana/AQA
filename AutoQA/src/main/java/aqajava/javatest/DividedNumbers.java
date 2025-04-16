package aqajava.javatest;

public class DividedNumbers {
    public static void main(String[] args) {
        testDivision(6, 2);
        testDivision(12, 6);
        testDivision(3, 0);
        testDivision(12, 0);
    }

    public static double dividedNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    public static void testDivision(int numerator, int denominator) {
        try {
            double divisionResult = dividedNumbers(numerator, denominator);
            System.out.println(numerator + " / " + denominator + " = " + divisionResult + ".");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
