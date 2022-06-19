package za.ac.cput.schoolmanagement.factory.country;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.country.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {
    @Test
    void createCity(){
        City firstCity = CityFactory.createCity("2","London", CountryFactory.createCountry( "3","England"));

        assertAll(
                ()-> assertTrue(firstCity.getName().isEmpty()),
                ()-> assertTrue(firstCity.getId().isEmpty()),
                ()-> assertNotNull(firstCity.getCountry())
        );
        City city = CityFactory.createCity("5","Vancouver", CountryFactory.createCountry("2","Canada"));
        assertNotNull(firstCity);
        System.out.println(firstCity.toString());


    }

    @Test
    public void completedValues(){
        City city = CityFactory.createCity("6","Toronto",CountryFactory.createCountry("2","Canada"));
        System.out.println(city);
        assertNotNull(city);
    }

}