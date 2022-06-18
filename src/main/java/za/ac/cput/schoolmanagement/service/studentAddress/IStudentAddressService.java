package za.ac.cput.schoolmanagement.service.studentAddress;

import za.ac.cput.schoolmanagement.domain.StudentAddress;
import za.ac.cput.schoolmanagement.service.IService;

public interface IStudentAddressService extends IService<StudentAddress, String> {
    void deleteById(String id);
}
