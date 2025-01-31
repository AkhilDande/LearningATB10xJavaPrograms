package ex_13_functions;

import java.util.Scanner;

public class Lab_121_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();  // Input for a

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();  // Input for b

        // Perform all operations
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));

        // Check division result and handle error for division by zero
        int Divresult = div(a, b);
        if (Divresult == -1) {
            System.out.println("Division by Zero is not possible");
        } else {
            System.out.println("Division: " + Divresult);  // Division result will only be printed if valid
        }

        // Perform modulo operation
        System.out.println("Modulo: " + mod(a, b));
    }

    // Method for sum
    static int sum(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    static int sub(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    static int mul(int a, int b) {
        return a * b;
    }

    // Method for division, returns -1 if division by zero occurs
    static int div(int a, int b) {
        if (b == 0) {
            return -1;  // Return -1 to indicate division by zero
        } else {
            return a / b;  // Perform the division
        }
    }

    // Method for modulo operation
    static int mod(int a, int b) {
        return a % b;  // Return the remainder
    }
}
