package com.demo.StudentRegistration.controller;

import com.demo.StudentRegistration.entity.Student;
import com.demo.StudentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository _studentRepository;

    public StudentController(){

    }

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this._studentRepository = studentRepository;
    }

    @GetMapping(path="/students", produces = "application/json")
    List<Student> students() {
        return _studentRepository.findAll();
    }

    @GetMapping(path="/student/{id}", produces = "application/json")
    Student findStudentById(@PathVariable("id") Integer id){
        return _studentRepository.findById(id);
    }

    @PostMapping(path="/addStudent", consumes = "application/json")
    void insertStudent(@RequestBody Student student){
        _studentRepository.save(student);
    }

    @GetMapping(path="/student/delete/{id}")
    void deleteStudent(@PathVariable("id") Integer id){
        _studentRepository.deleteById(id);
    }
}
