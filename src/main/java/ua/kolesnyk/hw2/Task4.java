package ua.kolesnyk.hw2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.print ("Введите число: ");
        a = scan.nextInt();
        System.out.println ("Введите второе число: ");
        b = scan.nextInt();
        System.out.println ("Введите третье число: ");
        c = scan.nextInt();
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println ("Меньшее по модулю из трёх вещественных чисел: "+a);
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println ("Меньшее по модулю из трёх вещественных чисел: "+b);
        } else {
            System.out.println ("Меньшее по модулю из трёх вещественных чисел: "+c);
        }
    }
}
