package za.ac.cput.schoolmanagement.factory.employee;


import za.ac.cput.schoolmanagement.domain.country.City;
import za.ac.cput.schoolmanagement.domain.country.Country;
import za.ac.cput.schoolmanagement.domain.employee.EmployeeAddress;
import za.ac.cput.schoolmanagement.domain.lookup.Address;
import za.ac.cput.schoolmanagement.util.helper;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String staffId, Address address) {

        helper.checkStringPara("staffId", staffId);

        return new EmployeeAddress.Builder().setStaffId(staffId).setAddress(address).build();
    }

}
