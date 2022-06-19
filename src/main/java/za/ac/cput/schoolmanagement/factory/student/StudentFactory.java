package za.ac.cput.schoolmanagement.factory.student;


/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 *
 */

import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.domain.student.Student;

public class StudentFactory {
    public static Student createStudent(String studentId, Name name, String email) {
        return new Student.Builder()
                .setStudentId(studentId)
                .setName(name)
                .setEmail(email)
                .build();
    }
}
