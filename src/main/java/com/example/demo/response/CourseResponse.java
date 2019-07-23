package com.example.demo.response;

import com.example.demo.dto.CourseDto;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Aaditya.t on 23/7/19.
 */


@Data
@Builder
public class CourseResponse {
    private CourseDto courseDto;
}
