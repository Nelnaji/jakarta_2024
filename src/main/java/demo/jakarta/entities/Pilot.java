package demo.jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Pilot extends Person {



  @Column(unique = true,nullable = false, length = 20)
  private String licenseNumber;



    public Pilot(){}

    public Pilot(String firstName, String lastName, String phoneNumber, Address address, String licenseNumber) {
        super(firstName, lastName, phoneNumber, address);
        this.licenseNumber = licenseNumber;
    }

    public String getPlateNumber() {
        return licenseNumber;
    }

    public void setPlateNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "Pilot{" +
                "licenseNumber='" + licenseNumber + '\'' +
                '}';
    }



}
