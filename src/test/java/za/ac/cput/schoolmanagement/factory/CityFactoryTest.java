package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CityFactoryTest
 * Date 16 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.City;
import za.ac.cput.schoolmanagement.domain.Country;
import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {



    @Test
    void createCity(){
        City cityCreated = CityFactory.build("0000","Paris", CountryFactory.build( "Congo","Brazaville"));

        assertAll(
                ()-> assertTrue(cityCreated.getName().isEmpty()),
                ()-> assertTrue(cityCreated.getId().isEmpty()),
                ()-> assertNotNull(cityCreated.getCountry()));

        City city = CityFactory.build("0000","Cape Town", CountryFactory.build("Goma","DRC"));
        assertNotNull(cityCreated);
        System.out.println(cityCreated);
    }

    @Test
    public void completedValues() {
        City city = CityFactory.build("0000", "L'shi", CountryFactory.build("Congo", "Brazaville"));
        System.out.println(city);
        assertNotNull(city);
    }
}