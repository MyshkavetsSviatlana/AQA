package aqajava.hw7;

/*
Create an array [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1], loop through it,
and multiply numbers smaller than 6 by 2.
 */

import java.util.Arrays;

public class MultiplyNumInArrayBy2 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original array: " + Arrays.toString(array));

        for(int i = 0; i < array.length; i ++) {
            if(array[i] < 6) {array[i] *= 2;}
        }
        System.out.println("Changed array: " + Arrays.toString(array));
    }
}
