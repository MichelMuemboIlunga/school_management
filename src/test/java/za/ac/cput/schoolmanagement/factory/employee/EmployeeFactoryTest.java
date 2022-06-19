package za.ac.cput.schoolmanagement.factory.employee;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.employee.Employee;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.factory.lookup.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    Name name = NameFactory.createName("Michel","Frank","Anne");

    @Test
    @Order(1)
    public void buildWithNullName(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                EmployeeFactory.createEmployee("6","frankka@mycput.ac.za",null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }

    @Test
    @Order(2)
    public void buildWithInvalidEmail(){

        Exception exception = assertThrows(IllegalArgumentException.class,()->
                EmployeeFactory.createEmployee("2748596","michelgmail.com", new Name("John","dhoe","Martin")));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }

    @Test
    @Order(3)
    public void buildWithEmptyStaffId(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                EmployeeFactory.createEmployee("85","franka@mycput.ac.za",new Name("Merlin","king","sage")));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }

    @Test
    @Order(4)
    public void buildWithSuccess(){
        Employee employee = EmployeeFactory.createEmployee("5", "frankk@mycput.ac.za",new Name("lionel","Messi","charle"));
        assertNotNull(employee);
        System.out.println(employee);
    }

}