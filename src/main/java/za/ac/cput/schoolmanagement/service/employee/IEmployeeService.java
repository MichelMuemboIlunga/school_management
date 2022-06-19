package za.ac.cput.schoolmanagement.service.employee;

import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> findAll();


    Optional<Employee> findEmployeeByStaffID(String staffId);
}
