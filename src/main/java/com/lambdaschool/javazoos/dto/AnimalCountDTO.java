package com.lambdaschool.javazoos.dto;

import javax.persistence.Tuple;

public class AnimalCountDTO {
    public Object animalid;
    public Object animaltype;
    public Object countzoos;

    public AnimalCountDTO(Tuple tuple) {
        animalid = tuple.get("ANIMALID");
        animaltype = tuple.get("ANIMALTYPE");
        countzoos = tuple.get("COUNTZOOS") == null ? 0 : tuple.get("COUNTZOOS");
    }
}