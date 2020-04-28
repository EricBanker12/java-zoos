package com.lambdaschool.javazoos.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long animalid;

    @Column(nullable = false)
    @Getter
    @Setter
    private String animaltype;

    @Getter
    @Setter
    private String incomingzoo;

    @ManyToMany(mappedBy = "animals")
    private List<Zoo> zoos;

    public Animal() {}

    public Animal(String animaltype, String incomingzoo) {
        this.animaltype = animaltype;
        this.incomingzoo = incomingzoo;
    }

}