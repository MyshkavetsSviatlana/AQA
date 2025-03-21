package aqajava.hw7;

import java.util.Scanner;

/*
Write a method that takes an integer as a parameter. The method should
return true if the number is negative and return false if the number is positive.
Note: zero is considered a positive number.
*/

public class PositiveOrNegativeBool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println(positiveOrNegativeBool(a));
    }

    public static boolean positiveOrNegativeBool(int a) {
        return a < 0;
    }
}
