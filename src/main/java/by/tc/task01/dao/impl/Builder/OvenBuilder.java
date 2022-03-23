package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Oven;

public class OvenBuilder {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;
    private Double depth;
    private Double capacity;

    public OvenBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public OvenBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public OvenBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public OvenBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public OvenBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public OvenBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public OvenBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public OvenBuilder setDepth(Double depth) {
        this.depth = depth;
        return this;
    }

    public OvenBuilder setCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Oven createOven() {
        return new Oven(brand, width, height, weight, color, overallCapacity, powerConsumption, depth, capacity);
    }
}
