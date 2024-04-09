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
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
