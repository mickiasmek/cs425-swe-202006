package edu.miu.cs.cs425.eregistrar.service;

import edu.miu.cs.cs425.eregistrar.model.Student;
import org.springframework.data.domain.Page;


import java.util.Optional;


public interface StudentService {


    public abstract Iterable<Student> getAllStudent();
    public abstract Page<Student> getAllStudentPaged(int pageNo);
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
    public abstract Optional<Student> findByStudentNumber(String studentNumber);
}
