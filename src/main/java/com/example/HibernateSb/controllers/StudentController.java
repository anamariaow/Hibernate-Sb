package com.example.HibernateSb.controllers;

import com.example.HibernateSb.entities.Student;
import com.example.HibernateSb.repository.StudentRepository;
import com.example.HibernateSb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("scuoladevelhope")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.creaStudente(student);
        return ResponseEntity.ok().body(student); //new ResponseEntity<>(student, HttpStatusCode.valueOf(200)) oppure HttpStatus.OK/ oppure return ResponseEntity.ok().body(student);
    }

    @GetMapping("/selectstudent")
    public ResponseEntity<List<Student>> selectAllStudent() {
        List<Student> allStudents = studentService.viewList();
        return ResponseEntity.ok().body(allStudents);
    }
}
