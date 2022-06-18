package za.ac.cput.schoolmanagement.domain;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for City
 * Date 16 June 2022
 */

public class City {

    private String id, name;
    private Country country;


    private City(Builder builder){
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

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }

    public static class Builder {

        private String id, name;
        private Country country;

        public Builder setId(String id) {
            this.id = id;
            return this;

        }

        public Builder setName(String name) {
                this.name = name;
                return this;

        }

        public Builder setCountry(Country country) {
                    this.country = country;
                    return this;

        }

        public Builder copy(City city){
            this.id = city.id;;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build(){
            return new City(this);
        }

    }
}
