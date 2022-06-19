package za.ac.cput.schoolmanagement.factory.lookup;

import za.ac.cput.schoolmanagement.domain.country.City;
import za.ac.cput.schoolmanagement.domain.lookup.Address;
import za.ac.cput.schoolmanagement.util.helper;

import java.time.temporal.ValueRange;

public class AddressFactory {
    public static Address createAddress(String unitNumber, String complexName,
                                        String streetNumber, String streetName, int postCode,
                                        City city) {

        int minValue = 1000;
        int maxValue = 9999;
        ValueRange range = ValueRange.of(minValue,maxValue);

        // validating StreetName, StreetName and City
        if (helper.isEmptyOrNull(streetNumber) || helper.isEmptyOrNull(streetName) || helper.isEmptyOrNull(city.getName()))
            throw new IllegalArgumentException("Street Number, Street Name and city name are required ");

        if (range.isValidIntValue(postCode)) {
            System.out.println("Value is within the Range of " + minValue + " and " + maxValue);

        } else {
            System.out.println("Value is not within the Range of " + minValue + " and " + maxValue);
            throw new IllegalArgumentException("Invalid Post Code");

        }

<<<<<<< HEAD:src/main/java/za/ac/cput/schoolmanagement/factory/AddressFactory.java
        return new Address.Builder().setUnitNumber(unitNumber)
                .setComplexName(complexName).setStreetNumber(streetNumber)
                .setStreetName(streetName).setPostCode(postCode).build();
=======
        return new Address.Builder().setUnitNumber(unitNumber).setComplexName(complexName).setStreetNumber(streetNumber).setStreetName(streetName).setPostalCode(postCode).build();
>>>>>>> upstream/master:src/main/java/za/ac/cput/schoolmanagement/factory/lookup/AddressFactory.java

    }
}
