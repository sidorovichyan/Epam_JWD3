package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Gadget {
    private String videoCard;
    private Integer usb;
    private Integer htmi;

    public Laptop(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Double batteryCpacity, String operatingSystem, Double centralProcessingUnit, Double memoryROM, Double batteryCapacity, Double systemMemory, Double displayInches, Double flashMemoryCapacity, String videoCard, Integer usb, Integer htmi) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption, batteryCpacity, operatingSystem, centralProcessingUnit, memoryROM, batteryCapacity, systemMemory, displayInches, flashMemoryCapacity);
        this.videoCard = videoCard;
        this.usb = usb;
        this.htmi = htmi;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Integer getUsb() {
        return usb;
    }

    public void setUsb(Integer usb) {
        this.usb = usb;
    }

    public Integer getHtmi() {
        return htmi;
    }

    public void setHtmi(Integer htmi) {
        this.htmi = htmi;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{"+
                "videoCard='" + videoCard + '\'' +
                ", usb=" + usb +
                ", htmi=" + htmi +super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getVideoCard(), laptop.getVideoCard()) && Objects.equals(getUsb(), laptop.getUsb()) && Objects.equals(getHtmi(), laptop.getHtmi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getVideoCard(), getUsb(), getHtmi());
    }

}
