package za.ac.cput.schoolmanagement.repository.studentAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.StudentAddress;

@Repository
public interface IStudentAddressRepository extends JpaRepository<StudentAddress, String> {

}
