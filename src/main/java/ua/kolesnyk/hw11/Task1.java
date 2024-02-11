package ua.kolesnyk.hw11;

//Реализовать метод, принимающий список строк и возвращающий Map,
//где ключ - строка, значение - количество букв в строке.
//Пример:
//[“тут”, “там”, “стол”] ->[ {“тут”, 3}, {“там”, 3}, {“стол”, 4}]

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        List<String> inputList = List.of("тут", "там", "стол");
        Map<String, Integer> result = countStringLengths(inputList);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.print("{" + entry.getKey() + ", " + entry.getValue() + "},");
        }
    }

    public static Map<String, Integer> countStringLengths(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }

}