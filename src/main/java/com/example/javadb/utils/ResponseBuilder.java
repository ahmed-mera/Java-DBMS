package com.example.javadb.utils;

import com.example.javadb.beans.ErrorBean;
import com.example.javadb.beans.ErrorElement;
import com.example.javadb.beans.ErrorResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ResponseBuilder {


        public static ErrorBean buildErrorResponse(LocalDateTime startTime, int errorCode, String errorMessage) {
            List<ErrorElement> errors = new ArrayList<>();
            errors.add(new ErrorElement(errorCode, errorMessage));
            return buildErrorResponse(startTime, errors);
        }


        public static ErrorBean buildErrorResponse(LocalDateTime startTime, List<ErrorElement> errors) {
            return new ErrorBean(startTime, LocalDateTime.now(), false, new ErrorResponse(errors));
        }


}
