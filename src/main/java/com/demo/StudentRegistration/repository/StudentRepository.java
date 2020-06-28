package com.demo.StudentRegistration.repository;

import com.demo.StudentRegistration.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>  {
    Student findById(int id);
    void deleteById (int id);
}


