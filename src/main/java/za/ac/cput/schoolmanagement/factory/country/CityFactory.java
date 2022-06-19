package za.ac.cput.schoolmanagement.factory.country;

import za.ac.cput.schoolmanagement.domain.country.City;
import za.ac.cput.schoolmanagement.domain.country.Country;
import za.ac.cput.schoolmanagement.util.helper;

public class CityFactory {
    public static City createCity(String id, String name, Country country) {

        helper.checkStringPara("countryId", id);
        helper.checkStringPara("countryName", name);
        helper.checkStringPara("country", country.getName());
        return new City.Builder().setId(id).setName(name).setCountry(country).build();
    }
}
