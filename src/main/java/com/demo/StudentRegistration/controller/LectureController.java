package com.demo.StudentRegistration.controller;

import com.demo.StudentRegistration.entity.Lecture;
import com.demo.StudentRegistration.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lectures")
public class LectureController {

    private LectureRepository _lectureRepository;

    public LectureController(){

    }

    @Autowired
    public LectureController(LectureRepository lectureRepository){
        this._lectureRepository = lectureRepository;
    }

    @GetMapping(produces = "application/json")
    List<Lecture> lectures() {
        return _lectureRepository.findAll();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    Lecture findLectureById(@PathVariable("id") Integer id){
        return _lectureRepository.findById(id).get();
    }

    @PostMapping(consumes = "application/json")
    void insertLecture(@RequestBody Lecture lecture){
        _lectureRepository.save(lecture);
    }

    @DeleteMapping(path="/{id}")
    void deleteStudent(@PathVariable("id") Integer id){
        _lectureRepository.deleteById(id);
    }

    void enrollStudentToLecture(){

    }
}

