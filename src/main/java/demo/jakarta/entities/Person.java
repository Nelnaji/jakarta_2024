package demo.jakarta.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person extends BaseEntity<Long> {

    @Column(nullable = false,length = 123)
    private String firstName;
    @Column(nullable = false,length = 80)
    private String lastName;
    @Column(nullable = true,length = 15)
    private String phoneNumber;
    @Embedded
    private Adresse adresse;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, String phoneNumber, Adresse adresse) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.adresse = adresse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return  super.toString() + " " +
                "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
