package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Double cordLength;

    public Speakers(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Integer numberOfSpeakers, String frequencyRange, Double cordLength) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public Double getCordLength() {
        return cordLength;
    }

    public void setCordLength(Double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "{numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength + super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(getNumberOfSpeakers(), speakers.getNumberOfSpeakers()) && Objects.equals(getFrequencyRange(), speakers.getFrequencyRange()) && Objects.equals(getCordLength(), speakers.getCordLength());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
    }
}
