package edu.miu.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentId;
	
	@NotBlank(message = "Student Number is required")
	@Column(name="studentNumber", unique = true, nullable=false)
	private String studentNumber;
	
	@NotBlank(message = "First Name is required")
	@Column(name="firstName", unique = true, nullable=false)
	private String firstName;
	
	@Column(name="middleName", unique = true, nullable=true)
	private String middleName;
	
	@NotBlank(message = "Last Name is required")
	@Column(name="lastName", unique = true, nullable=false)
	private String lastName;
	
	@Column(name="cgpa")
	private Double cgpa;
	 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfEnrollment;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "transcript", nullable = false)
	private Transcript transcript;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="classroom", nullable = false)
	private Classroom classroom;
	


	//default constructor
	public Student() {
		super();
	}


	//constructor 2
	public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName,
			double cgpa, LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
		this.transcript = transcript;
		this.classroom = classroom;
	}

	//constructor 3
	public Student(@NotBlank(message = "Student Number is required") String studentNumber,
			@NotBlank(message = "First Name is required") String firstName, String middleName,
			@NotBlank(message = "Last Name is required") String lastName, Double cgpa, LocalDate dateOfEnrollment,Transcript transcript,Classroom classroom) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
		this.transcript = transcript;
		this.classroom = classroom;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
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

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}


	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	

	public Transcript getTranscript() {
		return transcript;
	}


	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	
	public Classroom getClasroom() {
		return classroom;
	}


	public void setClasroom(Classroom clasroom) {
		this.classroom = clasroom;
	}


	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentNumber=%s, firstName=%s, middleName=%s, lastName=%s, cgpa=%s, dateOfEnrollment=%s, transcript=%s]",
				studentId, studentNumber, firstName, middleName, lastName, cgpa, dateOfEnrollment, transcript);
	}
	
	
	

}
