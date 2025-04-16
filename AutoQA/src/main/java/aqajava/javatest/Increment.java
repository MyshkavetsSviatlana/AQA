package aqajava.javatest;

public class Increment {
    public static void main(String[] args) {
        int a = 14;
        int b = (a++ - --a) * 2;
        b += 10;
        int c = ++b - --a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
