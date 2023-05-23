package com.student.studentmanagement.controller;

import com.student.studentmanagement.model.Student;
import com.student.studentmanagement.service.StudentService;
import com.student.studentmanagement.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    public final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping
    public Student createStudent(Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/id")
    public Student getStudent(@PathVariable ("id") int id){
        return studentService.getStudent(id);
    }
    @GetMapping
    public Iterable<Student> allgetStudent(){
        return studentService.allgetStudent();
    }
    @DeleteMapping("/id")
    public void deleteStudent(@PathVariable ("id") int id){
        studentService.delete(id);
    }

}
