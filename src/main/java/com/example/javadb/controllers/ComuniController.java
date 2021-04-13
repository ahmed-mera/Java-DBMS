package com.example.javadb.controllers;

import com.example.javadb.services.ComuniService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Slf4j
public class ComuniController {

    @Autowired
    private ComuniService comuniService;
}
