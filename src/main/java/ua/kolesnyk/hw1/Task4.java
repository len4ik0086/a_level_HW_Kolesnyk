package ua.kolesnyk.hw1;

public class Task4 {
    public static void main(String... args) {
        int a = 5;
        int b = 3;
        System.out.println("Before: a = "+a+", b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After: a = "+a+", b = "+b);
    }
}