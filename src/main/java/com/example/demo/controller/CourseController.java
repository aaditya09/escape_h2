package com.example.demo.controller;

import com.example.demo.request.CreateCourseRequest;
import com.example.demo.response.CourseListResponse;
import com.example.demo.response.CourseResponse;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aaditya.t on 23/7/19.
 */


@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
            this.courseService = courseService;
        }

    @PostMapping(consumes = "application/json")
    public ResponseEntity addCourses(@RequestBody CreateCourseRequest request){
        courseService.create(request);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{course_id}")
    public ResponseEntity<CourseResponse> getCourse(@PathVariable(name = "course_id") Integer courseId){
        return new ResponseEntity<>(
                CourseResponse.builder()
                        .courseDto(courseService.get(courseId))
                        .build(),
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<CourseListResponse> getAllCourses(){
        return new ResponseEntity<>(
                CourseListResponse.builder()
                        .courses(courseService.getAll())
                        .build(),
                HttpStatus.OK);
    }



}

