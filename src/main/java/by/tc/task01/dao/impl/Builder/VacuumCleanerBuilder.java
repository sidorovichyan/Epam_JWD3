package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private Double cleaningWidth;

    public VacuumCleanerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public VacuumCleanerBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public VacuumCleanerBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public VacuumCleanerBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public VacuumCleanerBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VacuumCleanerBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public VacuumCleanerBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public VacuumCleanerBuilder setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder setBagType(String bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder setWandType(String wandType) {
        this.wandType = wandType;
        return this;
    }

    public VacuumCleanerBuilder setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
        return this;
    }

    public VacuumCleanerBuilder setCleaningWidth(Double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
        return this;
    }

    public VacuumCleaner createVacuumCleaner() {
        return new VacuumCleaner(brand, width, height, weight, color, overallCapacity, powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
