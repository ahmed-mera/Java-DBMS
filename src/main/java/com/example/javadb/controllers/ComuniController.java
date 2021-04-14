package com.example.javadb.controllers;

import com.example.javadb.entities.ComuniEntity;
import com.example.javadb.services.ComuniService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@Slf4j
public class ComuniController {

    @Autowired
    private ComuniService comuniService;


    @RequestMapping("/")
    public ResponseEntity<List<ComuniEntity>> getAllData() throws Exception {
        return new ResponseEntity<>(this.comuniService.populate(), HttpStatus.OK);
    }

}
