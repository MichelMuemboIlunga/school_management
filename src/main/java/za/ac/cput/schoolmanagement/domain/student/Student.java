package za.ac.cput.schoolmanagement.domain.student;

/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 *
 */



import com.sun.istack.NotNull;
import za.ac.cput.schoolmanagement.domain.lookup.Name;

import javax.persistence.*;
import java.io.Serializable;
import java.util.regex.Pattern;


@Entity
@Table(name = "tStudent")
public class Student implements Serializable {

    @Id
    private String studentId;

    @NotNull
    private String email;

    @Embedded
    private Name name;

    public Student() {}

    public Student(Builder builder) {
        this.studentId= builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public static class Builder {
        private String studentId;
        private String email;
        private Name name;

        public Builder setStudentId (String studentId){
            this.studentId = studentId;
            return this;
        }

        public Builder setEmail (String email){
            this.email = email;
            return this;
        }

        public Builder setName (Name name){
            this.name = name;
            return this;
        }

        public Builder copy (Student student){
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;
            return this;
        }

            public Student build () {
                return new Student(this);
            }
        public static boolean patternMatches(String emailAddress, String regexPattern) {
            return Pattern.compile(regexPattern)
                    .matcher(emailAddress)
                    .matches();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", name=" + name +
                '}';
    }
}



