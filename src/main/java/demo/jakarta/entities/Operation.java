package demo.jakarta.entities;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operation extends BaseEntity<Long> {

    @Column(nullable = false)
    private LocalDateTime operationDate;

    @Column(nullable = false)
    @Range(min = 0)
    private int duration;


    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;


    public Operation(){
        super();
    }

    public Operation(LocalDateTime operationDate, int duration) {
        this();
        this.operationDate = operationDate;
        this.duration = duration;
    }


    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    @Range(min = 0)
    public int getDuration() {
        return duration;
    }

    public void setDuration(@Range(min = 0) int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operationDate=" + operationDate +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Operation operation = (Operation) o;
        return duration == operation.duration && Objects.equals(operationDate, operation.operationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), operationDate, duration);
    }
}
