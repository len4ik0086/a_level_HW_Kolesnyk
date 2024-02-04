package ua.kolesnyk.hw10;

//Реализовать утильный класс со статическими методами:
//• getSum(List<Integer> numbers) - возвращает сумму элементов списка
//• getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
//• convertToStringList(List<Integer> numbers) - возвращает новый список строк
//• doubling(List<String> strings) – возвращает новый список, в котором дублирует
//каждую строку и конкатенирует ее
//- input: “2i”
//- output: “2i2i”

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 6, 7, 8, 9);
        System.out.println("Сумма  чисел : " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Нечетные числа: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("Новый  список : " + stringList);

        List<String> doubledList = doubling(stringList);
        System.out.println("Список с дубликатами: " + doubledList);
    }

    //• getSum(List<Integer> numbers) - возвращает сумму элементов списка
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //• getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    //• convertToStringList(List<Integer> numbers) - возвращает новый список строк
    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    //• doubling(List<String> strings) – возвращает новый список, в котором дублирует
    //каждую строку и конкатенирует ее
    //- input: “2i”
    //- output: “2i2i”
    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }

}
