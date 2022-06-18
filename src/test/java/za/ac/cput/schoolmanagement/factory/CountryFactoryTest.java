package za.ac.cput.schoolmanagement.factory;

/**
 * @Author Sinoxolo Jaca
 * Student Number 213172607
 * Description Entity for CountryFactoryTest
 * Date 16 June 2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @Test
    public void buildWithSucess (){
        Country country = CountryFactory.build ("DRC","Kinshasa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void buildWithError() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> CountryFactory
                .build(null, "South Africa"));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("country ID is required!", exceptionMessage);
    }
}