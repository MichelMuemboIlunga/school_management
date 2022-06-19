package za.ac.cput.schoolmanagement.factory.country;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.country.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @Test
    public void build (){
        Country country = CountryFactory.createCountry("1","Goma");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void buildWithError() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> CountryFactory.createCountry("" ,"DRC"));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame(  "country ID is required!", exceptionMessage);

    }

}