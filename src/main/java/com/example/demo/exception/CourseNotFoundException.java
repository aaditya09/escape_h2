package com.example.demo.exception;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Aaditya.t on 23/7/19.
 */

@Data
public class CourseNotFoundException extends ObjectNotFoundException {
    public CourseNotFoundException(String msg){
        super(msg);
    }
}
