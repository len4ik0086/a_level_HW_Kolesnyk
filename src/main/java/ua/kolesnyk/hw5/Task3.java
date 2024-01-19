package ua.kolesnyk.hw5;
//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//которая поменяет местами столбцы и строки.
//До После
//1 2 1 3
//3 4 2 4

//*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
//Изначальный массив не должен измениться

//Требования к задачам:
//А) выведение массива в консоль до/после операций над массивом (если был пустой – не нужно)
//Б) Все расчеты проводить в отдельных методах и возвращать значение, которое выводится в
//консоль в методе main().
//В) Исходный массив не должен измениться, т.е. создаем копию и работаем с ней, если требуется
//изменение массива.

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size in case NxN: ");
        int input = scanner.nextInt();
        int[][] originalArray = fillArray(input);
        System.out.println("Original  array : " + Arrays.deepToString(originalArray));
        int[][] copiedArray = copyArray(input, originalArray);
        System.out.println("Copied   array  : " + Arrays.deepToString(copiedArray));
        swapRowsAndColumns(copiedArray);
        System.out.println("Transposed array: " + Arrays.deepToString(copiedArray));
        System.out.println("Original  array : " + Arrays.deepToString(originalArray));
    }

    public static int[][] fillArray(int input) {
        int[][] array = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static int[][] copyArray(int input, int[][] array) {
        int[][] copy = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                copy[i][j] = array[i][j];
            }
        }
        return copy;
    }

    public static void swapRowsAndColumns(int[][] copy) {
        int rows = copy.length;
        int cols = copy[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = copy[i][j];
                copy[i][j] = copy[j][i];
                copy[j][i] = temp;
            }
        }
    }

}