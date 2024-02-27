package ua.kolesnyk.hw13;

import com.google.gson.annotations.SerializedName;

public class Box {
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
