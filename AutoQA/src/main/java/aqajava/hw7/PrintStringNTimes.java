package aqajava.hw7;

import java.util.Scanner;

/*
Write a method that takes a string and a number as arguments
and prints the string to the console the specified number of times.
 */

public class PrintStringNTimes {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String stringArg = scannerString.nextLine();
        System.out.println("Enter any number: ");
        int stringInt = scannerInt.nextInt();
        printStringNTimes(stringArg, stringInt);
    }

    public static void printStringNTimes(String stringArg, int stringInt) {
        for(int i = 1; i <= stringInt; i ++){
            System.out.println(stringArg);
        }
    }
}
