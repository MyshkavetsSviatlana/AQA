package aqajava.javatest;

public class CheckIntPalindrome {

    public static void main(String[] args) {
        checkIntPalindrome(123321);
        checkIntPalindrome(4321234);
        checkIntPalindrome(1212);
        checkIntPalindrome(12345);
        checkIntPalindrome(-12344321);
    }

    public static void checkIntPalindrome(int number) {
        String numberToString = Integer.toString(number);
        String reversedNumber = new StringBuilder(numberToString).reverse().toString();

        if (numberToString.equals(reversedNumber)) {
            System.out.println("This number is a palindrome.");
        } else {
            System.out.printf("This number %s is not a palindrome.", number + "\n");
        }
    }
}
