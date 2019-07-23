package com.example.demo.transformer;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import org.springframework.stereotype.Component;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Component
public class CourseTransformer {
    public CourseDto getCourseDto(Course course){
        return CourseDto.builder()
                .id(course.getCourseId())
                .name(course.getName())
                .build();
    }
}
