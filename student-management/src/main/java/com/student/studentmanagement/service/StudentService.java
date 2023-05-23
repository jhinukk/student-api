package com.student.studentmanagement.service;

import com.student.studentmanagement.model.Student;

public interface StudentService {
    public Student createStudent(Student student);
    public Student getStudent(int id);
    public Iterable<Student> allgetStudent();
    public void delete(int id);

}
