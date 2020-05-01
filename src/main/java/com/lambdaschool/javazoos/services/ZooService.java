package com.lambdaschool.javazoos.services;

import java.util.List;

import com.lambdaschool.javazoos.models.Zoo;

public interface ZooService {

    List<Zoo> findAll();

    Zoo findById(long id);

    String save(Zoo zoo);

}