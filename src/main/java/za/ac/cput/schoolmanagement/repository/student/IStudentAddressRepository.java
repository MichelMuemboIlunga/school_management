package za.ac.cput.schoolmanagement.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.student.StudentAddress;

@Repository
public interface IStudentAddressRepository extends JpaRepository<StudentAddress, String> {
}