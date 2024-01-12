package ua.kolesnyk.hw3;

import java.util.Scanner;

//Задача 2.
//Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом).

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Введите значение: ");
        String a = scan.nextLine();
        if (IsPalindrome(a)) {
            System.out.println("Введенное значение Палиндром");
        }else{
            System.out.println("Введенное значение не является Палиндромом");
        }
    }

    public static String SpaceReplaceAll(String a) {
        String ta = a.replaceAll(" ", "");
        return ta;
    }

    public static boolean IsPalindrome(String ta) {
        StringBuffer temp = new StringBuffer(ta);
        temp.reverse();
        String rta = temp.toString();
        if (rta.equals(ta)){
            return true;
        } else {
            return false;}
    }
}
