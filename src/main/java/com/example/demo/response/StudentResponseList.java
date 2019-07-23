package com.example.demo.response;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by Aaditya.t on 23/7/19.
 */


@Builder
@Data
public class StudentResponseList {
    List<StudentDto> studentDtoList;
}
