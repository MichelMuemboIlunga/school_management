/*
 * Address Entity
 * Author: Emeka Nwamadi (219404070)
 * Date: June 2022
 */
package za.ac.cput.schoolmanagement.domain;

import com.sun.istack.NotNull;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Employee implements Serializable {
    @NotNull
    @Id
    private String staffId;

    @NotNull
    private String email, name;

    protected Employee(){}

    public Employee(Builder builder) {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }


    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeName() {
        return name;
    }



    public static class Builder{

        private String staffId;
        private String email;
        private String name;


        public Employee.Builder setStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public Employee.Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Employee.Builder setEmployeeName(String name){
            this.name = name;
            return this;
        }


        public Builder copy(Employee employee) {
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;


            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }


    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
