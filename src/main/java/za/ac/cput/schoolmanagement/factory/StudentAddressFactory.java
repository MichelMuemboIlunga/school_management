package za.ac.cput.schoolmanagement.factory;
/**
 * StudentAddressRepository.java;
 * This is a student address domain class
 * @Author: Lufulwabo Franck Kalengayi : 220048762
 * Date: 12 June 2022
 */


import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.StudentAddress;
import za.ac.cput.schoolmanagement.util.helper;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId, Address address) throws IllegalArgumentException{
        helper.checkStringParam("studentId", studentId);
        helper.checkIfObjectNull("address", address);
        return new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();
    }
}
