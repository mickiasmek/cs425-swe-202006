package edu.miu.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//Transcripts
		Transcript t1 = new Transcript("BS Computer Science");
		Transcript t2 = new Transcript("BS Software Engineering");
		Transcript t3 = new Transcript("MS Data Science");
		Transcript t4 = new Transcript("MS Computer Science");
		
		//Classroom
		Classroom c1 = new Classroom("McLaughlin building", "M105");
		
		//List of Students
		Student student1 = new Student("000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019, 5, 24), t1,c1);
		Student student2 = new Student("000-61-0002","Mike","Travis","Scot",3.99, LocalDate.of(2019, 2, 12), t2,c1);
		Student student3 = new Student("000-61-0003","Dani","","Mekonnen",3.40, LocalDate.of(2019, 2, 9), t3,c1);
		Student student4 = new Student("000-61-0004","Blen","Dawit","Amare",4.00, LocalDate.of(2019, 2, 7), t4,c1);
		
		
		
		List<Student> students = Arrays.asList(student1, student2,student3,student4);
		
		//save Students on to the database
		saveStudent(students);
		
		
		//print out list of students
		 for (Student s: students) { 
			 System.out.println(s); 
			 }
		 
	}

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}
	
	private Iterable<Student> saveStudent(List <Student> students) {
		return studentRepository.saveAll(students);
	}

}
