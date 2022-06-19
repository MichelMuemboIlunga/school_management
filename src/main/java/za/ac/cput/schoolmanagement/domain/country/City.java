package za.ac.cput.schoolmanagement.domain.country;


import com.sun.istack.NotNull;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tCity")
public class City implements Serializable {

    @Id
    @NotNull
    private String id;
    @NotNull
    private String name;
    @Embedded
    private Country country;

    protected City(){}

    public City(String id, String name){
        this.id = id;
        this.name = name;
    }

    public City(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {return country;}

    public static class Builder{
        private String id, name;
        private Country country;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setCountry(Country country){
            this.country = country;
            return this;
        }


        public Builder copy(City city) {
            this.id = city.id;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }

    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
