package za.ac.cput.schoolmanagement.domain.country;

import com.sun.istack.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tCountry")
public class Country implements Serializable {

    @Id
    private String id, name;

    protected Country(){}

    public Country(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }
    public String getId(){return id;}
    public String getName(){return name;}

    public static class Builder {
        private String id, name;

        public Country.Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Country.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Country country) {
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build() {
            return new Country(this);
        }


    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
