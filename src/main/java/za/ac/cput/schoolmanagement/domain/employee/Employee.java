package za.ac.cput.schoolmanagement.domain.employee;

import com.sun.istack.NotNull;
import za.ac.cput.schoolmanagement.domain.country.Country;
import za.ac.cput.schoolmanagement.domain.lookup.Name;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tEmployee")
public class Employee implements Serializable {

    @Id
    @NotNull
    private String staffId, email;

    @Embedded
    private Name name;

    protected Employee(){}

    public Employee(Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }
    public String getStaffId(){return staffId;}
    public String getEmail(){return email;}
    public Name getName(){return name;}

    public static class Builder {
        private String staffId, email;
        private Name name;

        public Builder setStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name){
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
                ", name=" + name +
                '}';
    }
}
