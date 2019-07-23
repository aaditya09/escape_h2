package com.example.demo.dto;

import com.example.demo.domain.Course;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Data
@Builder
public class StudentDto {
    private Integer id;
    private String name;
    private Set<Course> courses;
}
