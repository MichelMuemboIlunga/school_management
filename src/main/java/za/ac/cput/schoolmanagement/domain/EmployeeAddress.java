package za.ac.cput.schoolmanagement.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class EmployeeAddress {

    @Id

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

    @Override
    public String toString()
    {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
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
}




