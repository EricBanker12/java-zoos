package com.lambdaschool.javazoos.repositories;

import java.util.List;

import javax.persistence.Tuple;

import com.lambdaschool.javazoos.models.Animal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    
    @Query(
        value = "SELECT A.ANIMALID, ANIMALTYPE, COUNTZOOS FROM (SELECT ANIMALID, ANIMALTYPE FROM ANIMALS) AS A LEFT JOIN" 
            + " (SELECT ANIMALID, COUNT(ANIMALID) AS COUNTZOOS FROM ZOOANIMALS GROUP BY ANIMALID) AS B ON A.ANIMALID = B.ANIMALID",
        nativeQuery = true
    )
    List<Tuple> findAnimalAndCount();

}