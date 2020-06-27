package com.demo.StudentRegistration.controller;

import com.demo.StudentRegistration.repository.LectureRepository;
import com.demo.StudentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {
    private LectureRepository _lectureRepository;
    private StudentRepository _studentRepository;

    public EnrollmentController(){}

    @Autowired
    public EnrollmentController(LectureRepository lectureRepository,
                                StudentRepository studentRepository){
        this._lectureRepository = lectureRepository;
        this._studentRepository = studentRepository;
    }

    public void EnrollAStudent(){

    }

    public void DropAStudent(){

    }
}

