package aqajava.hw7;

import java.util.Scanner;

/*
Write a method that takes an integer as a parameter and prints
whether the number is positive or negative.
Note: zero is considered a positive number.
 */

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        checkPositiveOrNegative(a);
    }

    public static void checkPositiveOrNegative(int a) {
        if(a >= 0) {
            System.out.println("Number " + a + " is positive.");
        } else {System.out.println("Number " + a + " is negative.");}
    }
}
