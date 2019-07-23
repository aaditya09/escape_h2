package com.example.demo.service;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import com.example.demo.exception.CourseNotFoundException;
import com.example.demo.repository.CourseRepository;
import com.example.demo.request.CreateCourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.transformer.CourseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseTransformer courseTransformer;

    @Autowired
    public CourseService(CourseRepository courseRepository, CourseTransformer courseTransformer) {
        this.courseRepository = courseRepository;
        this.courseTransformer = courseTransformer;
    }

    public void create(CreateCourseRequest createCourseRequest) {
        Course course = new Course();
        course.setCourseId(createCourseRequest.getId());
        course.setName(createCourseRequest.getCourseName());
        courseRepository.save(course);
    }

    public CourseDto get(Integer courseId) throws CourseNotFoundException{
        Course course =  courseRepository.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundException("No course found for course id : " + courseId));

        return CourseDto.builder()
                .id(course.getCourseId())
                .name(course.getName())
                .build();
    }

    public List<CourseResponse> getAll() {
        return courseRepository.findAll()
                .stream()
                .map(course ->
                        CourseResponse.builder()
                                .courseDto(courseTransformer.getCourseDto(course))
                                .build())
                .collect(Collectors.toList());
    }
}
