package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Aaditya.t on 23/7/19.
 */


@Data
public class CreateCourseRequest {

    private Integer id;

    @JsonProperty("course_name")
    private String courseName;

}