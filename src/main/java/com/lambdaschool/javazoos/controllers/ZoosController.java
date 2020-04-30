package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.services.ZooService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zoos")
public class ZoosController {

    @Autowired
    private ZooService zooService;

    // /zoos/zoos
    @GetMapping(value = "/zoos", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<?> findAll() {
        return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
    }

    // /zoos/zoo/5
    @GetMapping(value = "/zoo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<?> findById(@PathVariable long id) {
        return new ResponseEntity<>(zooService.findById(id), HttpStatus.OK);
    }

}