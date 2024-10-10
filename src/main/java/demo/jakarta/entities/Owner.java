package demo.jakarta.entities;

import jakarta.persistence.Entity;

@Entity
public class Owner extends Person {
    public Owner() {
    }

    public Owner(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
    }


}
