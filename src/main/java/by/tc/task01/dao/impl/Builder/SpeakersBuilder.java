package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder {
    private String brand;
    private Double width;
    private Double height;
    private Double weight;
    private String color;
    private Double overallCapacity;
    private Double powerConsumption;
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Double cordLength;

    public SpeakersBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public SpeakersBuilder setWidth(Double width) {
        this.width = width;
        return this;
    }

    public SpeakersBuilder setHeight(Double height) {
        this.height = height;
        return this;
    }

    public SpeakersBuilder setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public SpeakersBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public SpeakersBuilder setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public SpeakersBuilder setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public SpeakersBuilder setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
        return this;
    }

    public SpeakersBuilder setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder setCordLength(Double cordLength) {
        this.cordLength = cordLength;
        return this;
    }

    public Speakers createSpeakers() {
        return new Speakers(brand, width, height, weight, color, overallCapacity, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
