package aqajava.hw7;

/*
 Write a method that takes a one-dimensional array and a number n (which can be positive or negative)
 as input, and shifts all elements of the array by n positions. The elements are shifted cyclically.
 To complicate the task, you cannot use auxiliary arrays.
 Examples: [1, 2, 3] when n = 1 (shifted one to the right) -> [3, 1, 2];
 [3, 5, 6, 1] when n = -2 (shifted two to the left) -> [6, 1, 3, 5].
 You can choose which direction to shift based on n.
 */

import java.util.Arrays;

public class ShiftingArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: "+ Arrays.toString(arr));
        System.out.println("Shifted array: "+ Arrays.toString(shiftArrayElements(arr, 2)));
    }

    public static int[] shiftArrayElements(int[] array, int n) {
        if(n < 0){
            n = array.length + n;
        }
        while(n!=0) {
            for (int i = 0; i < array.length - 1; i++) {
                int a = array[array.length - 1];
                int b = array[i];
                array[i] = a;
                array[array.length - 1] = b;
            }
            n--;
        }
        return array;
    }
}
