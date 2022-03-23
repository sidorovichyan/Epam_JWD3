package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Laptop;

public class LaptopBuilder {
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
    private String videoCard;
    private Integer usb;
    private Integer htmi;

    public LaptopBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public LaptopBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public LaptopBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public LaptopBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public LaptopBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public LaptopBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public LaptopBuilder setBatteryCpacity(Double batteryCpacity) {
        this.batteryCpacity = batteryCpacity;
        return this;
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public LaptopBuilder setCentralProcessingUnit(Double centralProcessingUnit) {
        this.centralProcessingUnit = centralProcessingUnit;
        return this;
    }

    public LaptopBuilder setMemoryROM(Double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public LaptopBuilder setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public LaptopBuilder setSystemMemory(Double systemMemory) {
        this.systemMemory = systemMemory;
        return this;
    }

    public LaptopBuilder setDisplayInches(Double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    public LaptopBuilder setFlashMemoryCapacity(Double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }

    public LaptopBuilder setVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public LaptopBuilder setUsb(Integer usb) {
        this.usb = usb;
        return this;
    }

    public LaptopBuilder setHtmi(Integer htmi) {
        this.htmi = htmi;
        return this;
    }

    public Laptop createLaptop() {
        return new Laptop(brand, width, height, weight, color, overallCapacity, powerConsumption, batteryCpacity, operatingSystem, centralProcessingUnit, memoryROM, batteryCapacity, systemMemory, displayInches, flashMemoryCapacity, videoCard, usb, htmi);
    }
}
