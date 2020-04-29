package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.services.AnimalsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalsController {

    @Autowired
    private AnimalsService animalsService;

    // GET /animals/all
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<?> getAnimals() {
        return new ResponseEntity<>(animalsService.findall(), HttpStatus.OK);
    }

    // GET /animals/count
    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<?> getAnimalsCount() {
        return new ResponseEntity<>(animalsService.getCount(), HttpStatus.OK);
    }

}