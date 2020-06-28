package com.demo.StudentRegistration.entity;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import javax.persistence.*;

//@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="LECTURES")
public class Lecture {

    @Id
    @Generated
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "Code", length = 8, nullable = false)
    private String code;

    @Column(name = "Name", length = 64, nullable = false)
    private String name;

    @Column(name = "Instructor", length = 64, nullable = false)
    private String instructor;

    @Column(name = "Quota", length = 64, nullable = false)
    private int quota;

    @Column(name = "StudentsEnrolled", length = 64, nullable = false)
    private int studentsEnrolled;


    @ManyToMany(cascade = { CascadeType.REFRESH }, fetch = FetchType.EAGER)
    @JoinTable(name = "lectures_students" ,
            joinColumns = {@JoinColumn(name ="lecture_id")},
            inverseJoinColumns = {@JoinColumn(name="student_id")})
    private Set<Student> students = new HashSet<>();
}
