package edu.miu.cs.cs425.eregistrarwebapi.service;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {


    List<Student> getAllStudents();
    Student registerNewStudent(Student newStudent);
    List<Student> getAllStudentsSorted();
    Student getStudentById(Integer studentId);
    Student updateStudent(Student editedStudent, Integer student);
    void deleteStudentById(Integer studentId);
}
