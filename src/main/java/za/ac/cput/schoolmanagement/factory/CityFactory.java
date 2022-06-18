package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CityFactory
 * Date 16 June 2022
 */

import za.ac.cput.schoolmanagement.domain.City;
import za.ac.cput.schoolmanagement.domain.Country;
import za.ac.cput.schoolmanagement.util.helper;


public class CityFactory {

    public static City build(String  id, String name, Country country)
            throws IllegalArgumentException{
        helper.checkStringParam("id",id);
        helper.checkStringParam("name",name);

        return new City.Builder().setId(id)
                .setName(name)
                .setCountry(country)
                .build();


    }
}
