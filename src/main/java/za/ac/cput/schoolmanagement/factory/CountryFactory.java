package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CountryFactory
 * Date 16 June 2022
 */

import za.ac.cput.schoolmanagement.util.helper;



public class CountryFactory {


    public static Country build(String countryId, String countryName){
        helper.checkStringParam("countryId",countryId);
        helper.checkStringParam("countryName", countryName);
        return new Country.Builder().setCountryId(countryId).setCountryName (countryName).build();
    }
}
