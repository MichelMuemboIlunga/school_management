package za.ac.cput.schoolmanagement.service.employee;

import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> findAll();

}
