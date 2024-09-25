package demo.jakarta.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class PilotPlaneType {


    @EmbeddedId
    private PilotPlaneTypeId id;

    @Column(nullable = false)
    @Range(min = 0)
    private int flightCounter;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pilotId")
    private Pilot pilot;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("planeTypeId")
    private PlaneType planeType;

    public PilotPlaneType() {
    }

    public PilotPlaneType(int flightCounter, Pilot pilot, PlaneType planeType) {
        this.flightCounter = flightCounter;
        this.pilot = pilot;
        this.planeType = planeType;
        this.id = new PilotPlaneTypeId(pilot.getId(), planeType.getId());
    }

    public PilotPlaneTypeId getId() {
        return id;
    }

    @Range(min = 0)
    public int getFlightCounter() {
        return flightCounter;
    }

    public void setFlightCounter(@Range(min = 0) int flightCounter) {
        this.flightCounter = flightCounter;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PilotPlaneType(PilotPlaneTypeId id, PlaneType planeType) {
        this.id = id;
        this.planeType = planeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PilotPlaneType that = (PilotPlaneType) o;
        return flightCounter == that.flightCounter && Objects.equals(id, that.id) && Objects.equals(pilot, that.pilot) && Objects.equals(planeType, that.planeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flightCounter, pilot, planeType);
    }

    @Embeddable
    public static class PilotPlaneTypeId {
        private Long pilotId;
        private Long planeTypeId;

        public PilotPlaneTypeId() {}

        public PilotPlaneTypeId(Long pilotId, Long planeTypeId) {
            this.pilotId = pilotId;
            this.planeTypeId = planeTypeId;
        }

        public Long getPilotId() {
            return pilotId;
        }

        public void setPilotId(Long pilotId) {
            this.pilotId = pilotId;
        }

        public Long getPlaneTypeId() {
            return planeTypeId;
        }

        public void setPlaneTypeId(Long planeTypeId) {
            this.planeTypeId = planeTypeId;
        }



    }
}
