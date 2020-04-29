package com.lambdaschool.javazoos.services;

import java.util.ArrayList;
import java.util.List;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.repositories.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "animalsService")
public class AnimalsServiceImpl implements AnimalsService {

    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public List<Animal> findall() {
        List<Animal> animalsList = new ArrayList<>();
        animalrepos.findAll()
            .iterator()
            .forEachRemaining(animal -> animalsList.add(animal));
        return animalsList;
    };

}