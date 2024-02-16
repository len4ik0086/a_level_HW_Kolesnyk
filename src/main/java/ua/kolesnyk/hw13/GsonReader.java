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
import com.google.gson.annotations.SerializedName;

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

class Box {
    @SerializedName("from")
    private String origin;
    @SerializedName("material")
    private String material;
    @SerializedName("color")
    private String color;
    @SerializedName("max-lifting-capacity")
    private Capacity maxLiftingCapacity;
    @SerializedName("cargo")
    private Cargo cargo;
    @SerializedName("delivery-date")
    private String deliveryDate;

    @Override
    public String toString() {
        return "Box{" +
                "from='" + origin + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}

class Capacity {
    @SerializedName("unit")
    private String unit;

    @SerializedName("value")
    private int value;

    @Override
    public String toString() {
        return "{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}

class Cargo {
    @SerializedName("name")
    private String name;

    @SerializedName("class")
    private String cargoClass;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cargoClass='" + cargoClass + '\'' +
                '}';
    }
}