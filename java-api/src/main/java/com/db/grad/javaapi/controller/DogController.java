package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.service.DogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class DogController {

    @Autowired
    private DogHandler dogHandler;

    @GetMapping("/dogs/{name}")
    public ResponseEntity<Dog> getDogByName(@PathVariable(value = "name") String name)
    {
        Dog dogs = dogHandler.getDogByName(name);
        return ResponseEntity.ok().body(dogs);
    }
}
