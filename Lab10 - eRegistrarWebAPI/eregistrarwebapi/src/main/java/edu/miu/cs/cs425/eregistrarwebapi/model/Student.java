package edu.miu.cs.cs425.eregistrarwebapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @NotBlank(message = "* Student Number is required!")
    private String studentNumber;

    @NotBlank(message = "* First Name is required!")
    @Column(name = "firstname", unique = true, nullable = false)
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @NotBlank
    @Column(name = "lastname",nullable = false)
    private String lastName;

    private Double cgpa;

    @NotBlank
    @Column(name = "isinternational", nullable = false)
    private Boolean isInternational;

    public Student() {
    }

    public Student(@NotBlank(message = "* Student Number is required!") String studentNumber, @NotBlank(message = "* First Name is required!") String firstName, String middleName, @NotBlank String lastName, Double cgpa, @NotBlank Boolean isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
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

    public Boolean getInternational() {
        return isInternational;
    }

    public void setInternational(Boolean international) {
        isInternational = international;
    }


}
