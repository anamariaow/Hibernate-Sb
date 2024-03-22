package com.example.HibernateSb.service;

import com.example.HibernateSb.entities.Student;
import com.example.HibernateSb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student creaStudente(Student student) {
        studentRepository.save(student);
        return  student;
    }

    public List<Student> viewList() {
        return studentRepository.findAll();
    }
}
