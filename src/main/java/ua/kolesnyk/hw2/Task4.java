package ua.kolesnyk.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Введите число: ");
        a = scan.nextInt();
        System.out.println("Введите второе число: ");
        b = scan.nextInt();
        System.out.println("Введите третье число: ");
        c = scan.nextInt();
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);
        if ((absA) < (absB) && (absA) < (absC)) {
            System.out.println("Меньшее по модулю из трёх вещественных чисел: " + a);
        } else if ((absB) < (absA) && (absB) < (absC)) {
            System.out.println("Меньшее по модулю из трёх вещественных чисел: " + b);
        } else {
            System.out.println("Меньшее по модулю из трёх вещественных чисел: " + c);
        }
    }
}
