package za.ac.cput.schoolmanagement.factory.lookup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.country.City;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    void createAddressPostalFailedTest(){
        Address address = AddressFactory.createAddress("788","dss","577","dhff",0, new City("1","New York"));
        System.out.println("The Address Is :" + address);
        assertNotNull(address);
    }

    @Test
    void createAddressPostalPassedTest(){
        Address address = AddressFactory.createAddress("788","dss","577","dhff",2000, new City("2", "Cape Town"));
        System.out.println("The Address Is :" + address);
        assertNotNull(address);
    }

    @Test
    void isEmptyStreetNumberOrStreetNameOrCityFailedTest(){
        Address address = AddressFactory.createAddress("788","myComplexName","","",6000, new City("3","Kinshasa"));
        System.out.println("Fields Are Required * : " + address);
        assertNotNull(address);
    }

    @Test
    void isNotEmptyStreetNumberOrStreetNameOrCityPassedTest(){
        Address address = AddressFactory.createAddress("788","myComplex","1234","myStreetName",9999, new City("4","Lubumbashi"));
        System.out.println("Fields Are Required * : " + address);
        assertNotNull(address);
    }
}