package ua.kolesnyk.hw10;

//Напишите Java-программу для обхода ArrayList с использованием:
//• цикла for,
//• for-each,
//• while,
//• итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        //• цикла for,
        System.out.println("Цикл for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //• for-each,
        System.out.println("Цикл for-each:");
        for (String element : list) {
            System.out.println(element);
        }

        //• while,
        System.out.println("Цикл while:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        //• итератора.
        System.out.println("Итератор:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}