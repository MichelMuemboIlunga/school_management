package za.ac.cput.schoolmanagement.factory.employee;

import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.util.helper;

public class EmployeeFactory {

    public static Employee createEmployee(String staffId, String email, Name name) {

        helper.checkStringPara("Staff Id", staffId);
        helper.checkStringPara("Email", email);
        helper.checkEmail(email);
        helper.checkIfObjectNull("Name",name);

        return new Employee.Builder().setStaffId(staffId).setEmail(email).setEmail(name.getMiddleName()).build();
    }


}
