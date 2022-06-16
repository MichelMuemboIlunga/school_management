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
    void createCity() {
        City city = CityFactory.createCity("Cape Town", "Sino", "South");

    }
}