package ua.kolesnyk.hw1;

public class Task3 {
    public static void main(String... args) {
        int a = 1;
        int b = 2;
        System.out.println("Before: a = "+a+", b = "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After: a = "+a+", b = "+b);
    }
}