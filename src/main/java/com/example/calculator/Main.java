package com.example.calculator;

/**
 * Main class to run the calculator application.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 20;
        double num2 = 5;

        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();

        // Perform and print calculations
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2));

        try {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + calc.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.err.println("Error during division: " + e.getMessage());
        }
        
        // Example of division by zero
        double num3 = 0;
        try {
            System.out.println("Attempting to divide by zero: " + num1 + " / " + num3);
            System.out.println("Result: " + calc.divide(num1, num3));
        } catch (IllegalArgumentException e) {
            System.err.println("Error as expected: " + e.getMessage());
        }
    }
}
