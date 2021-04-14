package com.example.javadb.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorBean {
    private LocalDateTime requestTimestamp;
    private LocalDateTime responseTimestamp;
    private boolean success;
    private ErrorResponse errors;
}



