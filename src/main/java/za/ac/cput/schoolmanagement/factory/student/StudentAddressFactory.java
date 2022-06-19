package za.ac.cput.schoolmanagement.factory.student;

import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.student.StudentAddress;
import za.ac.cput.schoolmanagement.util.helper;

public class StudentAddressFactory {
    public static StudentAddress createAddress(String studentId, Address address) throws IllegalArgumentException{
        helper.isEmptyOrNull(studentId);
        helper.checkIfObjectNull("address", address);
        return new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();
    }
}
