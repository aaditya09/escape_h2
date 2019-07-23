package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.response.StudentResponse;
import com.example.demo.response.StudentResponseList;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aaditya.t on 22/7/19.
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void createStudent(@RequestBody Student student)
    {

        studentService.createStudent(student);

    }

    @GetMapping
    public StudentResponseList getAllStudents()
    {
        return studentService.getAllStudents();

    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Integer id)
    {
        return studentService.getStudentById(id);
    }

}
