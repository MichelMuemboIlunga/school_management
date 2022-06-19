package za.ac.cput.schoolmanagement.domain.employee;

import com.sun.istack.NotNull;
import za.ac.cput.schoolmanagement.domain.Address;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tEmployeeAddress")
public class EmployeeAddress {

    @Id
    @NotNull
    private String staffId;

    @Embedded
    private Address address;

    protected EmployeeAddress(){ }

    private EmployeeAddress(Builder builder)
    {
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId()
    {
        return staffId;
    }

    public Address getAddress()
    {
        return address;
    }

    public static class Builder
    {
        private String staffId;
        private Address address;

        public Builder setStaffId(String staffId)
        {
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address)
        {
            this.address = address;
            return this;
        }

        public Builder copy( EmployeeAddress employeeAddress)
        {
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build()
        {
            return new EmployeeAddress(this);
        }

    }
    @Override
    public String toString()
    {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

}




