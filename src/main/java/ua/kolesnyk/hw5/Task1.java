package ua.kolesnyk.hw5;

//Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
//      массиве), при этом каждая вторая строка - отрицательными значениями.
//Например
//1 2 3
//-4 -5 -6
// 7 8 9
//-10 -11 -12
//*Передать массив в метод, заполнить данный массив

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputRow = new Scanner(System.in);
        System.out.print("Input array row quantity: ");
        int rows = inputRow.nextInt();
        Scanner inputCol = new Scanner(System.in);
        System.out.print("Input array column quantity: ");
        int cols = inputCol.nextInt();
        int[][] array = new int[rows][cols];
        fillArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fillArray(int[][] array) {
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i % 2 == 0) ? value : -value;
                value++;
            }
        }
    }

}