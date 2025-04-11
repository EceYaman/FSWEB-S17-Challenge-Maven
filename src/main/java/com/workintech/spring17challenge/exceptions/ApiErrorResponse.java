package com.workintech.spring17challenge.exceptions;

import com.workintech.spring17challenge.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;
}