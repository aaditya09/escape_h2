package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Entity
@Data
public class Course
{
    @Id
    @Column(name="course_id")
    Integer courseId;

    @Column
    String name;
}

