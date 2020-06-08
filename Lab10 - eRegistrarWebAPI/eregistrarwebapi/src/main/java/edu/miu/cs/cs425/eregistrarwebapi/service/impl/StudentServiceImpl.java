package edu.miu.cs.cs425.eregistrarwebapi.service.impl;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Autowired
    public  StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student registerNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public List<Student> getAllStudentsSorted() {
        return studentRepository.findAll(Sort.by("studentNumber"));
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudent(Student editedStudent, Integer studentId) {
        return null; /*studentRepository.findById(studentId)
        .map(student -> {
            student.setFirstName(editedStudent.getFirstName());
            student.set
        })
    }*/
    }
    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
        }


}
