package aqajava.hw10.swap;

import static aqajava.hw10.swap.SwapElements.swapTwoElements;

public class SwapElementsApp {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1., 2., 3.};
        Character[] charArray = {'a', 'b', 'c'};
        Boolean[] booleanArray = {true, true, true, false};
        Character[] charArray2 = {'a'};

        swapTwoElements(stringArray, 0, 1);
        swapTwoElements(intArray, 1, 2);
        swapTwoElements(doubleArray, 2, 0);
        swapTwoElements(charArray, 2, 1);
        swapTwoElements(booleanArray, 0, 3);
        swapTwoElements(charArray, 3, 1);
        swapTwoElements(charArray2, 2, 1);
    }
}
