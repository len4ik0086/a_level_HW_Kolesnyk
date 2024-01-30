package ua.kolesnyk.hw8;
//Создать функциональный интерфейс Pow с методом pow(int number, int
//pow), который принимает 2 параметра:
//1 - число которое возводится в степень,
//2 - степень в которую возводится число.

//Реализовать этот интерфейс в методе main через лямбду (без использования
//сторонних пакетов типа Math).

import java.util.Scanner;

@FunctionalInterface
interface Pow {
    int pow(int number, int exponent);
}

public class Task2 {
    public static void main(String[] args) {
        Pow powOperation = (number, exponent) -> {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            return result;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для возведения в степень: ");
        int base = scanner.nextInt();
        System.out.print("Введите знаяение степени, в которую возводите число: ");
        int exponent = scanner.nextInt();
        int result = powOperation.pow(base, exponent);

        System.out.println(base + " в степени " + exponent + " равняется " + result);
    }
}

