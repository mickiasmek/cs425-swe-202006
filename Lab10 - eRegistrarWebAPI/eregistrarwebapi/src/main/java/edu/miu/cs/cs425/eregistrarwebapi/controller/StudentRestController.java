package edu.miu.cs.cs425.eregistrarwebapi.controller;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/eregistrar/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {

    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(value = "/list")
    public List<Student> list(){
        return studentService.getAllStudents();

    }

    @GetMapping(value = "/get/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }

    @GetMapping(value = "/register")
    public Student registerNewStudent(@Valid @RequestBody Student student){
        return studentService.registerNewStudent(student);
    }

    @GetMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudentById(studentId);
    }
}
