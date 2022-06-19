package za.ac.cput.schoolmanagement.service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.repository.employee.IEmployeeRepository;
import za.ac.cput.schoolmanagement.service.employee.IEmployeeService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository repo;

    @Autowired
    public EmployeeServiceImpl(IEmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Optional<Employee> findEmployeeByStaffID(String staffId) {
        return this.repo.findEmployeeByStaffID(staffId);
    }

    @Override
    public Employee save(Employee employee) {
        return this.repo.save(employee);
    }

    @Override
    public Optional<Employee> read(String s) {
        return this.repo.findById(s);
    }

    @Override
    public void delete(Employee employee) {
        repo.delete(employee);
    }

}
