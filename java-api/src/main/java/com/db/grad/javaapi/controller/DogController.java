package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.service.DogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @Autowired
    private DogHandler dogHandler;

    @GetMapping


}
