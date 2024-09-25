package demo.jakarta.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class Plane extends BaseEntity<Long> {

    @Column(unique=true,nullable = false,length = 50)
    private String plateNumber;

    @Column(nullable = false)
    @Range(min = 0)
    private int flightNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private PlaneType planeType;

    @Column(nullable = true)
    @Range(min = 0)
    private int flightHours;

    public Plane(){}

    public Plane(String plateNumber, int flightNumber) {
        this();
        this.plateNumber = plateNumber;
        this.flightNumber = flightNumber;
    }

    public Plane(String plateNumber, int flightNumber, Owner owner, PlaneType planeType) {
        this(plateNumber, flightNumber);
        this.owner = owner;
        this.planeType = planeType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Range(min = 0)
    public int getFlyCount() {
        return flightNumber;
    }

    public void setFlyCount(@Range(min = 0) int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return flightNumber == plane.flightNumber && flightHours == plane.flightHours && Objects.equals(plateNumber, plane.plateNumber) && Objects.equals(owner, plane.owner) && Objects.equals(planeType, plane.planeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plateNumber, flightNumber, owner, planeType, flightHours);
    }

    @Override
    public String
    toString() {
        return "Plane{" +
                "plateNumber='" + plateNumber + '\'' +
                ", flightNumber=" + flightNumber +
                ", owner=" + owner +
                ", planeType=" + planeType +
                ", flightHours=" + flightHours +
                '}';
    }
}



