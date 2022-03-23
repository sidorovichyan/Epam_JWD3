package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private Double cleaningWidth;

    public VacuumCleaner(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, String filterType, String bagType, String wandType, String motorSpeedRegulation, Double cleaningWidth) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public Double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(Double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth=" + cleaningWidth + super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(getFilterType(), that.getFilterType()) && Objects.equals(getBagType(), that.getBagType()) && Objects.equals(getWandType(), that.getWandType()) && Objects.equals(getMotorSpeedRegulation(), that.getMotorSpeedRegulation()) && Objects.equals(getCleaningWidth(), that.getCleaningWidth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth());
    }
}
