/*
 * Address Entity
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 15 June 2022
 */
package za.ac.cput.schoolmanagement.domain.lookup;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;
import za.ac.cput.schoolmanagement.domain.country.City;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable{

    private String unitNumber;

    @NotNull
    private String complexName, streetNumber, streetName;

    @Column(nullable = false, updatable = false)
    private int postalCode;

    @Embedded
    @NotNull
    private City city;

    public Address(){}

    public Address(String unitNumber, String streetNumber, String streetName, int postalCode){
        this.unitNumber = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public Address(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;


    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }
    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    public static class Builder{
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;

        public Address.Builder setUnitNumber(String unitNumber){
            this.complexName = unitNumber;
            return this;
        }

        public Address.Builder setComplexName(String complexName){
            this.complexName = complexName;
            return this;
        }

        public Address.Builder setStreetNumber(String streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }

        public Address.Builder setStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public Address.Builder setPostalCode(int postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Address.Builder setCity(City city){
            this.city =  city;
            return this;
        }


        public Builder copy(Address address) {
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;

            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city=" + city +
                '}';
    }
}
