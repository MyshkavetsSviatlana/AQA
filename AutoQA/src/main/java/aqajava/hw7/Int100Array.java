package aqajava.hw7;

/*
Create an empty integer array of length 100.
Use a loop to fill it with the values 1, 2, 3, 4, 5, 6, 7, 8, …, 100.
 */

import java.util.Arrays;

public class Int100Array {
    public static void main(String[] args) {
        int[] int100Array = new int[100];
        for (int i = 0; i < int100Array.length; i++) {
            int100Array[i] = i+1;
        }
        System.out.println(Arrays.toString(int100Array));
    }
}
