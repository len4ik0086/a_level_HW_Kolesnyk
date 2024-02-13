package ua.kolesnyk.hw11;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент
//наугад 1000000 раз. Замерьте время, которое потрачено на это.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        long arrayListFillTime = fillArrayList();
        long linkedListFillTime = fillLinkedList();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long arrayListPickTime = pickRandomElements(arrayList);
        long linkedListPickTime = pickRandomElements(linkedList);

        System.out.println("Время заполнения ArrayList: " + arrayListFillTime + " нс");
        System.out.println("Время заполнения LinkedList: " + linkedListFillTime + " нс");
        System.out.println("Время на выборку элементов из ArrayList: " + arrayListPickTime + " нс");
        System.out.println("Время на выборку элементов из LinkedList: " + linkedListPickTime + " нс");
    }

    // Метод для заполнения ArrayList и измерения времени выполнения
    public static long fillArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Метод для заполнения LinkedList и измерения времени выполнения
    public static long fillLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Метод для выбора элементов наугад из списка и измерения времени выполнения
    public static long pickRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            System.out.println("Итерация " + (i + 1) + ": случайное выбор = " + randomIndex + ", значение = " + list.get(randomIndex));
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}