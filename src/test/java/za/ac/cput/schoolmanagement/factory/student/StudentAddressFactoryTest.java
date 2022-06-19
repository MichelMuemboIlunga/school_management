package za.ac.cput.schoolmanagement.factory.student;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.lookup.Address;
import za.ac.cput.schoolmanagement.domain.student.StudentAddress;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentAddressFactoryTest {

    @Test
    public void StudentAddressPassTest(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.createAddress("214785",
                address);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentFailTest(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.createAddress("",
                address);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentAddressNullFailTest(){
        Address address = new Address();
        StudentAddress studentAddress = StudentAddressFactory.createAddress("21156",null);
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }
}
