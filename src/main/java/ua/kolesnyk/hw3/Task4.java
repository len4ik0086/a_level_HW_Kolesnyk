package ua.kolesnyk.hw3;

import java.util.Random;
import java.util.Scanner;

//Программа "Угадай число"
//Задача
//Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
//
//Решение
//Описание переменных:
//
//a – число, "загаданное" компьютером;
//b – очередное число, вводимое пользователем.

public class Task4 {
    public static void main(String[] args) {
        int a = generateRandomNumber();
        System.out.println("Угадай число! \n Введите ваше число: ");
        Scanner input = new Scanner(System.in);
        boolean isNumberGuessed = false;
        do {
            int b = input.nextInt();
            if (b > a)
                System.out.println("Мое число меньше");
            else if (b < a)
                System.out.println("Мое число больше");
            else {
                System.out.println("Угадал!");
                isNumberGuessed = true;
            }
        } while (!isNumberGuessed);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}

