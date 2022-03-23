package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;
    private Double freezerCapacity;

    public RefrigeratorBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public RefrigeratorBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public RefrigeratorBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public RefrigeratorBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public RefrigeratorBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public RefrigeratorBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public RefrigeratorBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public RefrigeratorBuilder setFreezerCapacity(Double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
        return this;
    }

    public Refrigerator createRefrigerator() {
        return new Refrigerator(brand, width, height, weight, color, overallCapacity, powerConsumption, freezerCapacity);
    }
}
