package aqajava.hw11;

import java.util.ArrayList;

import static aqajava.hw11.MyArrayMethod.sumArrayElements;

public class MyArrayMethodApp {
    public static void main(String[] args) {
        // Positive testing
        // 4*4 2D convertible to int element str array
        String[][] twoDArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // leading spaces
        String[][] twoDArray2 = {{" 1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // trailing spaces
        String[][] twoDArray3 = {{"1 ", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // leading and trailing spaces
        String[][] twoDArray4 = {{" 1 ", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // negative int
        String[][] twoDArray5 = {{"-1 ", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // double
        String[][] twoDArray6 = {{"1.0", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
       // negative double
        String[][] twoDArray7 = {{"-1.0", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // Negative testing
        // empty element
        String[][] twoDArray8 = {{"", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // blank element
        String[][] twoDArray9 = {{" ", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // invalid double
        String[][] twoDArray10 = {{"1.1.1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // negative invalid double
        String[][] twoDArray11 = {{"-1.0.1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // str element
        String[][] twoDArray12 = {{"A", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // str cyrillic element preceded by '-'
        String[][] twoDArray13 = {{"-ф", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // special symbols
        String[][] twoDArray14 = {{"*.%].", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // 5*4 2D array
        String[][] twoDArray15 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // 3*4 2D array
        String[][] twoDArray16 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // 4*3 2D array
        String[][] twoDArray17 = {{"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}};
        // 4*5 2D array
        String[][] twoDArray18 = {{"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}};

        ArrayList<String[][]> arrays = new ArrayList<>();
        arrays.add(twoDArray);
        arrays.add(twoDArray2);
        arrays.add(twoDArray3);
        arrays.add(twoDArray4);
        arrays.add(twoDArray5);
        arrays.add(twoDArray6);
        arrays.add(twoDArray7);
        arrays.add(twoDArray8);
        arrays.add(twoDArray9);
        arrays.add(twoDArray10);
        arrays.add(twoDArray11);
        arrays.add(twoDArray12);
        arrays.add(twoDArray13);
        arrays.add(twoDArray14);
        arrays.add(twoDArray15);
        arrays.add(twoDArray16);
        arrays.add(twoDArray17);
        arrays.add(twoDArray18);

        for (String[][] array : arrays) {
            try {
                sumArrayElements(array);
                System.out.printf("The sum of the elements of the passed array is %s.\n", sumArrayElements(array));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}