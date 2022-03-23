package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;
    private Double batteryCpacity;
    private String operatingSystem;
    private Double centralProcessingUnit;
    private Double memoryROM;
    private Double batteryCapacity;
    private Double systemMemory;
    private Double displayInches;
    private Double flashMemoryCapacity;
    private String frontCam;
    private String backCam;

    public TabletPCBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public TabletPCBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public TabletPCBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public TabletPCBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public TabletPCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public TabletPCBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public TabletPCBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public TabletPCBuilder setBatteryCpacity(Double batteryCpacity) {
        this.batteryCpacity = batteryCpacity;
        return this;
    }

    public TabletPCBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public TabletPCBuilder setCentralProcessingUnit(Double centralProcessingUnit) {
        this.centralProcessingUnit = centralProcessingUnit;
        return this;
    }

    public TabletPCBuilder setMemoryROM(Double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public TabletPCBuilder setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public TabletPCBuilder setSystemMemory(Double systemMemory) {
        this.systemMemory = systemMemory;
        return this;
    }

    public TabletPCBuilder setDisplayInches(Double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    public TabletPCBuilder setFlashMemoryCapacity(Double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }

    public TabletPCBuilder setFrontCam(String frontCam) {
        this.frontCam = frontCam;
        return this;
    }

    public TabletPCBuilder setBackCam(String backCam) {
        this.backCam = backCam;
        return this;
    }

    public TabletPC createTabletPC() {
        return new TabletPC(brand, width, height, weight, color, overallCapacity, powerConsumption, batteryCpacity, operatingSystem, centralProcessingUnit, memoryROM, batteryCapacity, systemMemory, displayInches, flashMemoryCapacity, frontCam, backCam);
    }
}
