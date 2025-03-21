package aqajava.hw7;

import java.util.Scanner;

/*
Write a method that determines if a year is a leap year and returns a boolean
(leap year - true, not a leap year - false).
Every 4th year is a leap year, except every 100th year,
but every 400th year is a leap year.
*/

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year) {
        if(year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if(year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if(year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {System.out.println(year + " is not a leap year.");}
    }
}
