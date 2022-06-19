package za.ac.cput.schoolmanagement.service.employee.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.factory.employee.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceImplTest {

    @Autowired
    public EmployeeServiceImpl service;
    public Employee myEmployee;

    @BeforeEach
    void setUp() throws Exception {
        myEmployee = EmployeeFactory.createEmployee("2", "michelMuembo@gmail.com", new Name("Muembo","Ilunga","Michel"));

    }

    @Test
    void saveEmployeeTest(){
        Employee employee = this.service.save(myEmployee);
    }


}