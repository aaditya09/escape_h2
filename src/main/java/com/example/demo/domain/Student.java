package com.example.demo.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Aaditya.t on 22/7/19.
 */

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    Integer id;

    @Column
    String name;

    @Column()
    String standard;

    @JoinColumn(name = "semester_name")
    @OneToOne(cascade = CascadeType.ALL)
    Semester semester;

    @Column
    Long timestamp;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "courseId") })
    Set<Course> courses;
}
