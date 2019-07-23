package com.example.demo.response;

import com.example.demo.domain.Course;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Data
@Builder
public class StudentResponse {
    Integer id;
    String name;
    Set<Course> courses;
}
