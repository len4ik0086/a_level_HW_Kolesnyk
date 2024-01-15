package ua.kolesnyk.hw3;

import java.util.Scanner;

//Задача 3.
//Подсчитать количество слов в строке
//Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова:");
        String input = scan.nextLine();
        System.out.println("Вы ввели " + countWord(input) + " слова");

    }

    public static int countWord(String input) {
        String trimInput = input.replaceAll("[\\s]{2,}", " ");
        int count = 0;
        if (trimInput.length() != 0) {
            count++;
            for (int i = 0; i < trimInput.length(); i++) {
                if (trimInput.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
