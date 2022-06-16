package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CityFactory
 * Date 16 June 2022
 */

import za.ac.cput.schoolmanagement.domain.City;
import za.ac.cput.schoolmanagement.domain.Country;

public class CityFactory {

    public static City createCity(String id, String name, Country country){

        City city = new City.Builder()
                .setId(id)
                .setName(name)
                .setCountry(country)
                .build();
        return city;


    }
}
