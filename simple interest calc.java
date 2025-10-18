/**
 * A simple Java program to calculate Simple Interest.
 * Formula: Simple Interest = (Principal × Rate × Time) / 100
 *
 * Author: Your Name
 * Date: 2025-10-18
 */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display result
        System.out.println("---------------------------");
        System.out.println("Simple Interest = " + interest);
        System.out.println("Total Amount = " + (principal + interest));

        // Close the scanner
        sc.close();
    }
}
