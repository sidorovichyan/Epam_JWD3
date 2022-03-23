package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private Double freezerCapacity;

    public Refrigerator(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Double freezerCapacity) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption);
        this.freezerCapacity = freezerCapacity;
    }

    public Double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(Double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "{freezerCapacity=" + freezerCapacity + super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(getFreezerCapacity(), that.getFreezerCapacity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFreezerCapacity());
    }
}
