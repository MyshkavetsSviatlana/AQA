package aqajava.javatest.loops;

public class Loop3 {
    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.println("Current number " + number);
            number++;
            // infinite loop <= number is always < 5
            if (number < 5) {
                number = 0;
            }
        } while (true);
    }
}
