package edu.miu.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "transcript")
public class Transcript {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer transcriptId;
	
	@NotBlank
	private String name;
	
	@OneToOne(mappedBy = "transcript")
	private Student student;
	
	//default constructor
	public Transcript() {
		super();
	}

	//constructor 2
	public Transcript(Integer transcriptId, String name, Student student) {
		super();
		this.transcriptId = transcriptId;
		this.name = name;
		this.student = student;
	}

	
	//constructor 3
	public Transcript(String name) {
		super();
		this.name = name;
	}	
	
	public Student getStudent() {
		return student;
	}

	

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(Integer transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, name=%s]", transcriptId, name);
	}

}
