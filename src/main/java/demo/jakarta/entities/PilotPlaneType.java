package demo.jakarta.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

@Entity
public class PilotPlaneType {


    @EmbeddedId
    private PilotPlaneTypeId id;

    @Column(nullable = false)
    @Range(min = 0)
    private int flyCount;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pilotId")
    private Pilot pilot;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("planeTypeId")
    private PlaneType planeType;

    public PilotPlaneType() {}

    public PilotPlaneType(int flyCount, Pilot pilot, PlaneType planeType) {
        this.flyCount = flyCount;
        this.pilot = pilot;
        this.planeType = planeType;
//        this.id = new PilotPlaneTypeId(pilot.getId(), planeType.getId());
    }

    public PilotPlaneTypeId getId() {
        return id;
    }

    public int getFlyCount() {
        return flyCount;
    }

    public void setFlyCount(int flyCount) {
        this.flyCount = flyCount;
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

    @Override
    public String toString() {
        return "PilotPlaneType{" +
                "id=" + id +
                ", flyCount=" + flyCount +
                ", pilot=" + pilot +
                ", planeType=" + planeType +
                '}';
    }

    @Embeddable
    public static class PilotPlaneTypeId {
        private Long pilotId;
        private Long planeTypeId;

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

        //        public PilotPlaneTypeId(Long pilotId, Long planeTypeId) {
//            this.pilotId = pilotId;
//            this.planeTypeId = planeTypeId;
//        }
    }
}
