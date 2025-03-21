package aqajava.hw7;

import java.util.Scanner;
/*
 Write a method that takes two integers as input
 and checks if their sum is between 10 and 20 (inclusive).
 If yes, return true, otherwise return false.
*/

public class CheckSum {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();
        System.out.println(checkSum(a, b));
    }
    public static boolean checkSum(int a, int b) {
        int result = a + b;
        return result > 10 && result <= 20;
    }
}

