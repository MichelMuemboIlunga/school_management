package za.ac.cput.schoolmanagement.domain;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for Country
 * Date 16 June 2022
 */

public class Country {

    private String id, name;

    public Country(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {

        public String id, name;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;

        }

        public Country build(){
            return new Country(this);
        }
    }


}
