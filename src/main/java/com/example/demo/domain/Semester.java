package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Entity
@Table(name = "semester")
public class Semester {

    @Id
    Integer id;

    @Column(name = "semester_name")
    String semesterName;

}
