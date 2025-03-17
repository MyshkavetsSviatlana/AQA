package aqajava.hw6;

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 9;
        int result = a + b;
        if(result >= 0) {System.out.println("The sum is positive");
        } else {System.out.println("The sum is negative");}
    }
    public static void printColor(){
        int a = 7;
        if(a <= 0) {
            System.out.println("Red");
        } else if(a > 0 && a <= 100) {
            System.out.println("Yellow");
        } else {System.out.println("Green");}
    }

    public static void compareNumbers() {
        int a = 100;
        int b = 90;
        if(a >= b) {
            System.out.println("a >= b");
        } else {System.out.println("a < b");}
    }
}

