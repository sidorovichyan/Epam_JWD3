package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Gadget {
    private String frontCam;
    private String backCam;

    public TabletPC(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Double batteryCpacity, String operatingSystem, Double centralProcessingUnit, Double memoryROM, Double batteryCapacity, Double systemMemory, Double displayInches, Double flashMemoryCapacity, String frontCam, String backCam) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption, batteryCpacity, operatingSystem, centralProcessingUnit, memoryROM, batteryCapacity, systemMemory, displayInches, flashMemoryCapacity);
        this.frontCam = frontCam;
        this.backCam = backCam;
    }

    public String getFrontCam() {
        return frontCam;
    }

    public void setFrontCam(String frontCam) {
        this.frontCam = frontCam;
    }

    public String getBackCam() {
        return backCam;
    }

    public void setBackCam(String backCam) {
        this.backCam = backCam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(getFrontCam(), tabletPC.getFrontCam()) && Objects.equals(getBackCam(), tabletPC.getBackCam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFrontCam(), getBackCam());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{frontCam='" + frontCam + '\'' +
                ", backCam='" + backCam + '\'' +super.toString()+
                '}';
    }
}
