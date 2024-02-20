package ua.kolesnyk.hw13;

//Прочитать json файл и на его основе построить экземпляр класса Box (класс
//должен быть создан предварительно)
//Пример box.json
//{
//“from”:”China”,
//“material”:”steel”,
//“color”:”black”,
//“max-lifting-capacity”:{
//“unit”: “kg”,
//“value”: 150
//},
//“cargo”: {
//“name” : “electronics”,
//“class”: “C-1”
//},
//“delivery-date” : “2021-09-20T11:07:00”
//}

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GsonReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("box.json"))) {
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            String sanitizedJson = sanitizeJson(json.toString());
            Gson gson = new Gson();
            Box box = gson.fromJson(sanitizedJson, Box.class);
            System.out.println(box);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sanitizeJson(String json) {
        return json.replace("“", "\"").replace("”", "\"");
    }
}
