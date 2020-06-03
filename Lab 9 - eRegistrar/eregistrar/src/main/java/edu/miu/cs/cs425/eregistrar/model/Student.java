package edu.miu.cs.cs425.eregistrar.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    //@UniqueStudentNumber
    @NotBlank(message = "* Student Number is required")
    @Column(name = "student_number", nullable = false, unique = true)
    private String studentNumber;

    @NotBlank(message = "* First Name is required")
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @NotBlank(message = "* Last Name is required")
    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "cgpa")
    private Double cgpa;

    @NotBlank(message = "* Enrollment Date is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;

    @NotBlank(message = "* International status required")
    private String isInternational;


    public Student() {
    }

    public Student(Integer studentId, @NotBlank(message = "* Student Number is required") String studentNumber, @NotBlank(message = "* First Name is required") String firstName, String middleName, @NotBlank(message = "* Last Name is required") String lastName, Double cgpa, @NotBlank(message = "* Enrollment Date is required") LocalDate enrollmentDate, @NotBlank(message = "* International status required") String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getInternational() {
        return isInternational;
    }

    public void setInternational(String international) {
        isInternational = international;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate=" + enrollmentDate +
                ", isInternational=" + isInternational +
                '}';
    }
}
