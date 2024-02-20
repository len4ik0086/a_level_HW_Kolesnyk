package ua.kolesnyk.hw13;

import com.google.gson.annotations.SerializedName;

public class Capacity {
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