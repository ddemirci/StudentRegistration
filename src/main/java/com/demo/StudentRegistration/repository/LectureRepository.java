package com.demo.StudentRegistration.repository;

import com.demo.StudentRegistration.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository <Lecture,Integer>  {
    Lecture findById(int id);
    void deleteById (int id);
}


