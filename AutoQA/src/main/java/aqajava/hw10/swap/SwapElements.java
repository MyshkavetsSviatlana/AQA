package aqajava.hw10.swap;

/*
Write a method that swaps two elements in an array (the array can be of any reference type).
The array is supposed to be of any length and type, and you should be able to swap any two elements
at specified indices
 */

import java.util.Arrays;

public class SwapElements{

    public static <T> void swapTwoElements(T[] array, int ind1, int ind2) {
        try {
            T a = array[ind1];
            T b = array[ind2];
            array[ind1] = b;
            array[ind2] = a;
            System.out.println(Arrays.toString(array));
        } catch(ArrayIndexOutOfBoundsException e) {
            if(array.length < 2) {
                System.out.println("Make sure that minimum array length is 2.");
            } else {
                System.out.println("Maximum index cannot be greater than " + (array.length-1) + ".");
            }
        }
    }
}
