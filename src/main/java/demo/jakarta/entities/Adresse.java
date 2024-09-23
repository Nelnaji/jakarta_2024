package demo.jakarta.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Adresse {

    @Column(nullable = false,length = 150)
    private String street;
    @Column(nullable = false,length = 150)
    private String city;
    @Column(nullable = false,length = 150)
    private String state;

    public Adresse() {}

    public Adresse(String street, String city, String state) {
        this();
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
                
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return Objects.equals(street, adresse.street) && Objects.equals(city, adresse.city) && Objects.equals(state, adresse.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state);
    }
}
