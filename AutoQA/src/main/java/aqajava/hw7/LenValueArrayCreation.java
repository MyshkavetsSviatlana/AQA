package aqajava.hw7;

/*
Write a method that takes two arguments: len and initialValue,
and returns a one-dimensional int array of length len,
where each element is equal to initialValue.
 */

import java.util.Arrays;

public class LenValueArrayCreation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5, 3)));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for(int i = 0; i  < len; i ++) {
            array[i] = initialValue;
        }
        return array;
    }
}
