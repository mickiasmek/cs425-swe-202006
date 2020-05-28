package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;



public class MyStudentRecordsMgmtApp extends Student{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  ArrayList<Student> students = new ArrayList <Student>(Arrays.asList(
				new Student(110001,"Dave", LocalDate.of(1951, 11, 18)),
		  		new Student(110002,"Anna", LocalDate.of(1990, 12, 07)), 
		  		new Student(110003,"Erica", LocalDate.of(1974, 1, 31)), 
		  		new Student(110004,"Carlos", LocalDate.of(2009, 8, 22)),
		  		new Student(110005,"Bob", LocalDate.of(1990, 3, 05)))
		 );
		  
			int hello [] = {5,7,11,2,35};
			int b [] = {19,9,11,0,12};	
			
		 // printListOfStudents(students);
		  //getListOfPlatinumAlumniStudents(students);
		 // printHelloWorld(hello);
		  findSecondBiggest(b);
		
		}
	public static void printListOfStudents(ArrayList <Student> s1) {
		
		System.out.println("List of Students in Ascending Order ");
		
		s1.sort(Comparator.comparing(Student::getName, Comparator.naturalOrder()));
		
		for(Student s : s1) {
			System.out.println(s);
			}
		
	}
	
	public static List<Student> getListOfPlatinumAlumniStudents(ArrayList <Student> s1) {
		System.out.println("List of Alumini Students");
		List<Student> stu = new ArrayList<Student>();
		for(Student s: s1) {
			if((LocalDate.now().getYear()  -  s.getDateOfAdmission().getYear()) >= 30) {
				stu.add(s);	
			}
		}
		stu.sort(Comparator.comparing(Student::getDateOfAdmission, Comparator.reverseOrder()));
		for(Student s : stu) {
			System.out.println(s);
			}
		return stu;
	}
	
	public static void printHelloWorld(int []a) {
		boolean found = false;
		for(int i = 0; i<a.length; i++) {
			if(a[i]%5 == 0) {
				System.out.print("Hello");
				found = true;
			}if(a[i]% 7 == 0) {
				System.out.print("World");
				found = true;
			}
		
			 if(found) {System.out.println(); 
			 found = false; }
			
		}
	}
	
	public static void findSecondBiggest(int []a) {
		if (a.length == 0) System.out.println("no max");
		if(a.length == 1) System.out.println(a[0]);
		if(a.length == 2) {
			if(a[0]> a[1]) {
				System.out.println(a[1]);
			}else System.out.println(a[0]);
		}
		int max = a[0]; int secondMax = a[1];
		
		if(max < secondMax) {
			max = a[1];
			secondMax = a[0];
		}
		for(int i = 2; i<a.length; i++) {
			if(a[i] > secondMax && a[i] < max){
				secondMax = a[i];
			}else if(a[i] > secondMax && a[i] > max){
				secondMax = max;
				max = a[i];	
			}
			
		}
		System.out.println(secondMax);
		
	}
		

}
