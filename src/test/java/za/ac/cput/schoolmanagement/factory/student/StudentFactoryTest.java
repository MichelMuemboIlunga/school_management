package za.ac.cput.schoolmanagement.factory.student;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.domain.student.Student;
import za.ac.cput.schoolmanagement.factory.lookup.NameFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentFactoryTest {

    @Test
    void createStudent()
    {

        Name name = NameFactory.createName("Leon", "DeLange", "shone");
        Student student = StudentFactory.createStudent("235", name, "leon@gmail.com");

        Name name2 = NameFactory.createName("Franck", "Lufulwabo", "Kalengayi");
        Student student2 = StudentFactory.createStudent("Michel",name2,"michelilunga@gmail.com");

        assertNotNull(student);
        assertNotNull(student2);
        System.out.println("student1: " + student + " " + "student2: " + student2);

    }

}
