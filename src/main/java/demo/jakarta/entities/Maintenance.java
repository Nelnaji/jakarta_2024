package demo.jakarta.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class Maintenance extends Operation {

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic repairer;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic inspector;

    public Maintenance() {
        super();
    }

    public Maintenance(String description ) {
        this();
        this.description = description;
    }

    public Maintenance(String description, Plane plane, Mechanic repairer, Mechanic inspector) {
        this(description);
        this.plane = plane;
        this.repairer = repairer;
        this.inspector = inspector;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Mechanic getRepairer() {
        return repairer;
    }

    public void setRepairer(Mechanic repairer) {
        this.repairer = repairer;
    }

    public Mechanic getInspector() {
        return inspector;
    }

    public void setInspector(Mechanic inspector) {
        this.inspector = inspector;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "Maintenance{" +
                "description='" + description + '\'' +
                ", plane=" + plane +
                ", repairer=" + repairer +
                ", inspector=" + inspector +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Maintenance that = (Maintenance) o;
        return Objects.equals(description, that.description) && Objects.equals(plane, that.plane) && Objects.equals(repairer, that.repairer) && Objects.equals(inspector, that.inspector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, plane, repairer, inspector);
    }

}
