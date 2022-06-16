package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CountryFactory
 * Date 16 June 2022
 */

import za.ac.cput.schoolmanagement.domain.Country;


public class CountryFactory {


    public static Country createCountry(String id, String name){

        Country country = new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
        return null;
    }
}
