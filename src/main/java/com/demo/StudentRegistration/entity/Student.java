package com.demo.StudentRegistration.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter

@Table(name="STUDENT")
public class Student {

    @Id
    @Generated
    @Column(name = "Id", unique = true, nullable = false)
    private int id;

    @Column(name = "Name", length = 64, nullable = false)
    private String name;

    @Column(name = "Surname", length = 64, nullable = false)
    private String surname;

    @Column(name = "Year", length = 64, nullable = false)
    private int year;


    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "students")
    private Set<Lecture> lectures = new HashSet<>();

    public Student(){

    }

    public Student(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    @Override
    public String toString() {
        return String.format("Student %d , Name: %s Surname: %s"
                ,this.id, this.name, this.surname);
    }
}
