package com.example.javadb.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorElement {

    private int code;
    private String message;
}
