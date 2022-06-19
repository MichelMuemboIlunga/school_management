package za.ac.cput.schoolmanagement.controller.employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.service.employee.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{staffId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("staffId") String staffId) {
        Employee employee = employeeService.findEmployeeByStaffID(staffId).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.save(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("staffId") Employee employee) {
        employeeService.delete(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
