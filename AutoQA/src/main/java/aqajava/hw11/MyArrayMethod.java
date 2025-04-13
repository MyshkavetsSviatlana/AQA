package aqajava.hw11;

/*
1. Write a method that accepts a 4x4 two-dimensional string array as input.
If an array of a different size is passed, it should throw a MyArraySizeException.
2. Next, the method should iterate through all elements of the array, convert them to int,
and sum them up. If conversion fails for any element (for example, if the cell contains a character
or text instead of a number), a MyArrayDataException should be thrown with details specifying
which cell contains the invalid data.
3. In the main() method, call the method created, handle possible MyArraySizeException and
MyArrayDataException exceptions, and display the calculation result.
 */

public class MyArrayMethod {
    public static int sumArrayElements(String[][] twoDArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDArray.length != 4 || twoDArray[0].length != 4 || twoDArray[1].length != 1 || twoDArray[2].length != 4 || twoDArray[3].length != 4) {
            throw new MyArraySizeException();
        } else {
            int result = 0;
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[0].length; j++) {
                    //handle spaces
                    twoDArray[i][j] = twoDArray[i][j].trim();
                    //handle empty elements
                    if (twoDArray[i][j].isEmpty()) {
                        System.out.printf("An empty string at [%s][%s] of the passed array cannot be converted to int. ", i, j);
                        throw new MyArrayDataException();
                    }
                    //find out if str elements are digits
                    int isDigit = 0;
                    int isNegative = 0;
                    if (twoDArray[i][j].charAt(0) == '-') {
                        isNegative += 1;
                    }
                    for (int a = 0; a < twoDArray[i][j].length(); a++) {
                        if (!Character.isDigit(twoDArray[i][j].charAt(a))) {
                            isDigit += 1;
                        }
                    }
                    isDigit -= isNegative;
                    //find out if str can can be converted to doubles
                    int isDouble = 0;
                    for (int a = 0; a < twoDArray[i][j].length(); a++) {
                        if (twoDArray[i][j].charAt(a) == '.') {
                            isDouble += 1;
                        }
                    }
                    //handle elements not convertible to str
                    if (isDigit > 0 & isDouble != 1) {
                        System.out.printf("String %s at [%s][%s] of the passed array cannot be converted to int. ", twoDArray[i][j], i, j);
                        throw new MyArrayDataException();
                    }
                    //find sum if str is convertible to int
                    if (isDigit > 0 & isDouble == 1) {
                        Double doubleFromStr = Double.parseDouble(twoDArray[i][j]);
                        int intFromDouble = doubleFromStr.intValue();
                        result += intFromDouble;
                    } else if (isDigit == 0 & isDouble == 0) {
                        int intFromStr = Integer.parseInt(twoDArray[i][j]);
                        result += intFromStr;
                    }
                }
            }
            return (result);
        }
    }
}



