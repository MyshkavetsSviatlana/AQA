package aqajava.hw11;

public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Check the size of the array. The method accepts 4*4 2D String array.";
    }
}
