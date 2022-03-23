package by.tc.task01.entity;

import java.util.Objects;

public abstract class Gadget extends Appliance{
    private Double batteryCpacity;
    private String operatingSystem;
    private Double centralProcessingUnit;
    private Double memoryROM;
    private Double batteryCapacity;
    private Double systemMemory;
    private Double displayInches;
    private Double flashMemoryCapacity;


    public Gadget(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Double batteryCpacity, String operatingSystem, Double centralProcessingUnit, Double memoryROM, Double batteryCapacity, Double systemMemory, Double displayInches, Double flashMemoryCapacity) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption);
        this.batteryCpacity = batteryCpacity;
        this.operatingSystem = operatingSystem;
        this.centralProcessingUnit = centralProcessingUnit;
        this.memoryROM = memoryROM;
        this.batteryCapacity = batteryCapacity;
        this.systemMemory = systemMemory;
        this.displayInches = displayInches;
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public Double getBatteryCpacity() {
        return batteryCpacity;
    }

    public void setBatteryCpacity(Double batteryCpacity) {
        this.batteryCpacity = batteryCpacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getCentralProcessingUnit() {
        return centralProcessingUnit;
    }

    public void setCentralProcessingUnit(Double centralProcessingUnit) {
        this.centralProcessingUnit = centralProcessingUnit;
    }

    public Double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(Double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(Double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public Double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(Double displayInches) {
        this.displayInches = displayInches;
    }

    public Double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(Double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gadget)) return false;
        if (!super.equals(o)) return false;
        Gadget gadget = (Gadget) o;
        return Objects.equals(batteryCpacity, gadget.batteryCpacity) && Objects.equals(operatingSystem, gadget.operatingSystem) && Objects.equals(centralProcessingUnit, gadget.centralProcessingUnit) && Objects.equals(memoryROM, gadget.memoryROM) && Objects.equals(batteryCapacity, gadget.batteryCapacity) && Objects.equals(systemMemory, gadget.systemMemory) && Objects.equals(displayInches, gadget.displayInches) && Objects.equals(flashMemoryCapacity, gadget.flashMemoryCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCpacity, operatingSystem, centralProcessingUnit, memoryROM, batteryCapacity, systemMemory, displayInches, flashMemoryCapacity);
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{"+
                "batteryCpacity=" + batteryCpacity +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", centralProcessingUnit='" + centralProcessingUnit + '\'' +
                ", memoryROM=" + memoryROM +
                ", batteryCapacity=" + batteryCapacity +
                ", systemMemory=" + systemMemory +
                ", displayInches=" + displayInches +
                ", flashMemoryCapacity=" + flashMemoryCapacity + super.toString()+
                '}';
    }
}
