package za.ac.cput.schoolmanagement.repository.studentAddress;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.StudentAddress;
import za.ac.cput.schoolmanagement.factory.AddressFactory;
import za.ac.cput.schoolmanagement.factory.StudentAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

class IStudentAddressRepositoryTest  {

    @Test
    void buildWithSuccess() throws IllegalArgumentException{
        Country country = CountryFactory.build("0000", "DRC");
        City city = CityFactory.build("Cy", "Kinshasa", country);
        Address address = AddressFactory.build("420","Frank", "20", "Adderley Street", "6565", city);

        StudentAddress studentAddress = StudentAddressFactory
                .build("0000", address);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    void buildWithError() {
        Country country = CountryFactory.build("0000", "DRC");
        City city = CityFactory.build("Cy", "Kinshasa", country);
        Address address = AddressFactory.build("201","Frank", "20", "Adderley Street", "6565", city);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StudentAddressFactory
                        .build(null, address));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Student id is required!", exceptionMessage);
    }
}