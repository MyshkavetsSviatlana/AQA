package aqajava.hw7;

import java.util.Arrays;

/*
Create an integer array consisting of elements 0 and 1.
For example: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
Use a loop and condition to swap 0 to 1 and 1 to 0.
 */

public class Swap0And1InArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Original array: " + Arrays.toString(array));
        //System.out.println(Arrays.toString(array));
        int[] swapArray = swap0and1InArray(array);
        System.out.println("Swapped array: "+ Arrays.toString(swapArray));
    }

    public static int[] swap0and1InArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[i] = 1;
            } else {newArray[i] = 0;}
            }
        return newArray;
    }
}