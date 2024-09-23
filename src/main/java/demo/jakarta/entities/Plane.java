package demo.jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class Plane extends BaseEntity<Long> {

    @Column(unique = true, nullable = false, length = 50)
    private String plateNumber;

    @Column(unique = true, nullable = false)
    @Range(min = 0)
    private int flyCount;

    public Plane(){};
    public Plane(String plateNumber, int flyCount) {
        this.plateNumber = plateNumber;
        this.flyCount = flyCount;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Range(min = 0)
    public int getFlyCount() {
        return flyCount;
    }

    public void setFlyCount(@Range(min = 0) int flyCount) {
        this.flyCount = flyCount;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "plateNumber='" + plateNumber + '\'' +
                ", flyCount=" + flyCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return flyCount == plane.flyCount && Objects.equals(plateNumber, plane.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, flyCount);
    }
}


