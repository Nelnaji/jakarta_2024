package demo.jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Pilot extends Person {



  @Column(unique = true,nullable = false, length = 20)
  private String licenseNumber;


    @Column(unique=true,nullable = false,length = 50)
    private String plateNumber;

    public Pilot(){}

    public Pilot(String firstName, String lastName, String phoneNumber, Adresse adresse, String plateNumber) {
        super(firstName, lastName, phoneNumber, adresse);
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "Pilot{" +
                "plateNumber='" + plateNumber + '\'' +
                '}';
    }



}
