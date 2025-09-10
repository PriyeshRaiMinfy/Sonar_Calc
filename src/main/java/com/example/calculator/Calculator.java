package com.example.calculator;

/**
 * A simple Calculator class with basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a The number to subtract from.
     * @param b The number to subtract.
     * @return The difference.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * Throws an IllegalArgumentException if division by zero is attempted.
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
