package za.ac.cput.schoolmanagement.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.City;
import za.ac.cput.schoolmanagement.domain.Country;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;


class EmployeeAddressFactoryTest {

    @BeforeEach
    void setUp()
    { }

    @AfterEach
    void tearDown()
    { }

    @Test
    public void createEmployeeAddressTest()
    {
        Country country = CountryFactory.build("1CNTY1", "South Africa");
        City city = CityFactory.build("1CTY1", "Cape Town", country);
        Address address = AddressFactory.build("18", "Bluebell Village", "412", "Chumani Rd", "1818", city);

        var results = assertThrows(AssertionError.class, () -> EmployeeAddressFactory.build(null, address));
        var resultsTwo = assertThrows(AssertionError.class, () -> EmployeeAddressFactory.build("", address));
        var resultsThree = assertThrows(AssertionError.class, () -> EmployeeAddressFactory.build("1EMP1", null));

        assertThat(results.getMessage(), containsString("Invalid value for:"));
        assertThat(resultsTwo.getMessage(), containsString("Invalid value for:"));
        assertThat(resultsThree.getMessage(), containsString("Invalid value for:"));
        assertDoesNotThrow(() -> EmployeeAddressFactory.build("1EMP1", address));
    }
}