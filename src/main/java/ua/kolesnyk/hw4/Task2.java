package ua.kolesnyk.hw4;

//2.
//• Заполнить одномерный массив случайными целочисленными значениями.
//• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        fillArray(numbers);
        System.out.println("Original array: " + Arrays.toString(numbers));
        int primeCounter = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                primeCounter++;
            }
        }
        System.out.println("Prime number quantity is " + primeCounter + ".");
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100_000);
        }
        return array;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
