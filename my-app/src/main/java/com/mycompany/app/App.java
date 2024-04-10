package com.mycompany.app;

/**
 * Hello world!
 *
 */



 // Java Program to Check if Given Integer is Odd or Even
// Using Brute Forcew Approach

// Importing required classes
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            // If no command-line arguments provided, ask for input using Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            scanner.close();

            // Check if the number is odd or even
            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        } else {
            // If command-line argument provided, use it to check odd or even
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}
