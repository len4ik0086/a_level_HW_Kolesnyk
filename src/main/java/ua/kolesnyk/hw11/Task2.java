package ua.kolesnyk.hw11;

//Реализовать метод, который принимает список строк и возвращает Map с
//ключом в виде количества букв в строке и значением - список строк
//соответствующей длины.
//Пример:
//[“тут”, “там”, “стол”] ->[ {3, [“тут”, “там”]}, {4, [“стол”]}]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        List<String> inputList = List.of("тут", "там", "стол");
        Map<Integer, List<String>> result = mapStringsByLength(inputList);
        System.out.println(result);
    }

    public static Map<Integer, List<String>> mapStringsByLength(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            if (!resultMap.containsKey(length)) {
                resultMap.put(length, new ArrayList<>());
            }
            resultMap.get(length).add(str);
        }
        return resultMap;
    }

}
