package com.testmicroservice.testService.controller;

import com.testmicroservice.testService.models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Amila Wickramarathne.
 * Date: 8/2/2019
 * Time: 9:11 AM
 */
@RestController
@RequestMapping(path = "/test")
public class WelComeController {


    @Autowired
    Test test;


    @GetMapping(path = "/welcome")
    public ResponseEntity<Test> welcome() {

        test.setTestService("test service working");


        return new ResponseEntity<Test>(test, HttpStatus.CREATED);

    }
}