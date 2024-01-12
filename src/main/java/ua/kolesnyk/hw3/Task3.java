package ua.kolesnyk.hw3;

import java.util.Scanner;

//Задача 3.
//Подсчитать количество слов в строке
//Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова");
        String input = scan.nextLine();
        System.out.println("Вы ввели " + countWord(input) + " слова");

    }
    public static int countWord(String input) {
        int count = 0;
        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        return count;
    }
}
