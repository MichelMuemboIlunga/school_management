package za.ac.cput.schoolmanagement.factory.country;

import za.ac.cput.schoolmanagement.domain.country.City;
import za.ac.cput.schoolmanagement.domain.country.Country;
import za.ac.cput.schoolmanagement.util.helper;

import java.time.temporal.ValueRange;

public class CountryFactory {
    public static Country createCountry(String id, String name) {

        helper.checkStringPara("countryId", id);
        helper.checkStringPara("countryName", name);
        return new Country.Builder().setId(id).setName(name).build();
    }


}
