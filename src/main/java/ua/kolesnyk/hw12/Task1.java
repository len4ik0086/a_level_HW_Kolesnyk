package ua.kolesnyk.hw12;

//Реализовать программу которая считывает текст с консоли и строит CSV файл.
//● Если пользователь ввел next то происходит переход строки
//● Если пользователь вводит end то программа завершается
//Пример ввода:
//hi there
//world
//next
//hello
//next
//jesus
//end
//Пример результата:
//hi there, world,
//hello,
//jesus

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));

            System.out.println("Введите текст: \n" + "● Если ввели next, то происходит переход строки \n" +
                    "● Если ввели end, то программа завершается");

            String line;
            boolean firstWordWritten = false;
            while (!(line = scanner.nextLine()).equals("end")) {
                if (line.equals("next")) {
                    writer.newLine();
                    firstWordWritten = false;
                } else {
                    if (firstWordWritten) {
                        writer.write(", ");
                    } else {
                        firstWordWritten = true;
                    }
                    writer.write(line);
                }
            }

            scanner.close();
            writer.close();
            System.out.println("CSV файл создан.");
        } catch (IOException e) {
            System.out.println("Ошибка создания CSV файла: " + e.getMessage());
        }
    }
}
