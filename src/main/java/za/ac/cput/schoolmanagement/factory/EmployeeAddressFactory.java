package za.ac.cput.schoolmanagement.factory;

import org.hibernate.boot.model.source.internal.hbm.Helper;
import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.City;
import za.ac.cput.schoolmanagement.domain.Country;
import za.ac.cput.schoolmanagement.domain.EmployeeAddress;
import za.ac.cput.schoolmanagement.helper.Helper;
import za.ac.cput.schoolmanagement.domain.EmployeeAddress;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(String employeeId, Address address) throws IllegalArgumentException
    {
        validateAttributes(employeeId, address);
        Country country = CountryFactory.build(address.getCity().getCountry().getCountryId(), address.getCity().getCountry().getCountryName());
        City city = CityFactory.build(address.getCity().getId(), address.getCity().getName(), country);
        Address addrss = AddressFactory.build(address.getUnitNumber(), address.getComplexName(), address.getStreetNumber(), address.getStreetName(), address.getPostalCode(), city);

        return new EmployeeAddress.Builder()
                .setStaffId(employeeId)
                .setAddress(addrss).build();
    }

    private static void validateAttributes(String employeeId, Address address) throws IllegalArgumentException
    {
        Helper.checkIfObjectNull("address", address);
        Helper.checkIfObjectNull("city", address.getCity());
        Helper.checkIfObjectNull("country", address.getCity().getCountry());
        Helper.checkStringParam("employeeId", employeeId);
        Helper.checkStringParam("unitNumber", address.getUnitNumber());
        Helper.checkStringParam("complexName", address.getComplexName());
        Helper.checkStringParam("streetNumber", address.getStreetNumber());
        Helper.checkStringParam("streetName", address.getStreetName());
        Helper.checkStringParam("postalCode", address.getPostalCode());
        Helper.checkStringParam("cityId", address.getCity().getId());
        Helper.checkStringParam("cityName", address.getCity().getName());
        Helper.checkStringParam("countryId", address.getCity().getCountry().getCountryId());
        Helper.checkStringParam("countryName", address.getCity().getCountry().getCountryName());
    }
}
