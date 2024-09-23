package demo.jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Mechanic extends Person {

    @ManyToMany
    private Set<PlaneType> habilitations;

    public Mechanic(){
        this.habilitations = new HashSet<>();
    }

    public Mechanic(String firstName, String lastName, String phoneNumber, Adresse adresse) {
        super(firstName, lastName, phoneNumber, adresse);
        this.habilitations = new HashSet<>();
    }

    public void addHabilitation(PlaneType planeType){
        this.habilitations.add(planeType);
    }

    public void removeHabilitation(PlaneType planeType){
        this.habilitations.remove(planeType);
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "Mechanic{" +
                "habilitations=" + habilitations +
                '}';
    }
}
