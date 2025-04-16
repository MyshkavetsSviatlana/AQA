package aqajava.javatest.loops;

public class Loop4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                if (product % 2 == 0) {
                    System.out.println(product + " ");
                }
            }
        }
        System.out.println();
    }
}
