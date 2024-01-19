package ua.kolesnyk.hw5;

// Проверить заданный массив на упорядоченность по убыванию.
//*передать массив в метод, получить boolean

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array elements with ',' delimiter: ");
        String input = scanner.nextLine();
        String[] elements = input.split(",");
        int size = elements.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(elements[i].trim());
        }
        boolean isDescending = checkDescendingOrder(array);
        if (checkDescendingOrder(array)) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted in descending order.");
        }
    }

    static boolean checkDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

}


