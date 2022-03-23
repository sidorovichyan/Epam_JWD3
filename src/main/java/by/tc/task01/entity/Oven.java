package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private Double depth;
    private Double capacity;

    public Oven(String brand, Double width, Double height, Double weight, String color, Double overallCapacity, Double powerConsumption, Double depth, Double capacity) {
        super(brand, width, height, weight, color, overallCapacity, powerConsumption);
        this.depth = depth;
        this.capacity = capacity;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "depth=" + depth + ", capacity=" + capacity + super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Objects.equals(getDepth(), oven.getDepth()) && Objects.equals(getCapacity(), oven.getCapacity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDepth(), getCapacity());
    }
}
