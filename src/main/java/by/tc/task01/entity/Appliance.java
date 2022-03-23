package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;


    public Appliance(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption) {
        this.brand = brand;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.overallCapacity = overallCapacity;
        this.powerConsumption = powerConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appliance)) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(getBrand(), appliance.getBrand()) && Objects.equals(getWidth(), appliance.getWidth()) && Objects.equals(getHeight(), appliance.getHeight()) && Objects.equals(getWeight(), appliance.getWeight()) && Objects.equals(getColor(), appliance.getColor()) && Objects.equals(getOverallCapacity(), appliance.getOverallCapacity()) && Objects.equals(getPowerConsumption(), appliance.getPowerConsumption());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getWidth(), getHeight(), getWeight(), getColor(), getOverallCapacity(), getPowerConsumption());
    }

    @Override
    public String toString() {
        return " brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", overallCapacity='" + overallCapacity + '\'' +
                ", powerConsumption=" + powerConsumption ;
    }
}
