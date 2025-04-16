package aqajava.javatest.loops;

public class Loop2 {
    public static void main(String[] args) {
        int count = 0;
        boolean condition = true;
        // infinite loop <= condition always true
        while(condition) {
            count ++;
            System.out.println("iteration " + count);
        }
        if (count == 10) {
            condition = false;
        }
    }
}
