package za.ac.cput.schoolmanagement.factory.employee;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.schoolmanagement.domain.lookup.Address;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    public void EmployeeAddressFailedTest()
    {
        Address address = new Address();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress("", new Address());
        System.out.println(employeeAddress.toString());
        assertNotNull(employeeAddress);
    }

    @Test
    public void EmployeeAddressPassedTest()
    {
        Address address = new Address();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress("25", new Address("23","2","Arum Road", 2352));
        System.out.println("Employee: " + employeeAddress.toString());
        assertNotNull(employeeAddress);
    }

}