package ua.kolesnyk.hw4;

//1.
//• Заполнить одномерный массив случайными целочисленными значениями.
//• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
//400 элементов.
//P.S. значения элементов можно ограничить значениями 1-10 включительно.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fillArray(array);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Average arithmetical value of the array: " + avgAthArray(array));
        System.out.println("Average geometrical value of the array: " + avgGeoArray(array));

    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
        return array;
    }

    public static int avgAthArray(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        int average = sum / array.length;
        return average;
    }

    public static double avgGeoArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        double multy = 1f;
        for (double j : array) {
            if (j == 0) {
                return 0;
            } else {
                multy *= j;
            }
        }
        if (multy < 0 && array.length % 2 == 0) {
            return 0;
        }
        if (multy < 0 && array.length % 2 != 0) {
            return -(Math.pow(Math.abs(multy), 1d / array.length));
        }
        return (Math.pow(multy, 1d / array.length));
    }

}

