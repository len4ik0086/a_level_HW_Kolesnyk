package ua.kolesnyk.hw13;

import com.google.gson.annotations.SerializedName;

public class Cargo {
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