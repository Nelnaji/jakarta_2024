package demo.jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class Flight extends Operation {

    @Column(nullable = false)
    private int distance;

    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;

    @ManyToOne(fetch = FetchType.EAGER)
    @Range(min = 1, max = 2)
    private Pilot pilot;


    public Flight() {
        super();
    }

    public Flight(int distance) {
        this();
        this.distance = distance;
    }

    public Flight(int distance, Plane plane, Pilot pilot) {
        this();
        this.distance = distance;
        this.plane = plane;
        this.pilot = pilot;
    }


    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flight flight = (Flight) o;
        return distance == flight.distance && Objects.equals(plane, flight.plane) && Objects.equals(pilot, flight.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), distance, plane, pilot);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "distance=" + distance +
                ", plane=" + plane +
                ", pilot=" + pilot +
                '}';
    }
}
