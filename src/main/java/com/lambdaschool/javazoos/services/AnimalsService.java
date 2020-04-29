package com.lambdaschool.javazoos.services;

import java.util.List;

import com.lambdaschool.javazoos.dto.AnimalCountDTO;
import com.lambdaschool.javazoos.models.Animal;

public interface AnimalsService {

    List<Animal> findall();

    List<AnimalCountDTO> getCount();

}