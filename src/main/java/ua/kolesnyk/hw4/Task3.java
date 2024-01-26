package ua.kolesnyk.hw4;

//3.
//• Заполнить одномерный массив случайными целочисленными значениями.
//• Все четные значения заменить на нули. Размер массива - 2000 элементов.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[] originalArray = fillArray();
        System.out.println("Original array : " + Arrays.toString(originalArray));
        int[] copiedArray = replaceEvenToZero(originalArray);
        System.out.println("Even -> 0 array: " + Arrays.toString(copiedArray));
        System.out.println("Original array : " + Arrays.toString(originalArray));
    }

    public static int[] fillArray() {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100_000);
        }
        return array;
    }

    public static int[] replaceEvenToZero(int[] originalArray) {
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied  array  : " + Arrays.toString(copiedArray));

        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 2 == 0) {
                copiedArray[i] = 0;
            }
        }
        return copiedArray;
    }
}