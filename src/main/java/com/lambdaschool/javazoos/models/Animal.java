package com.lambdaschool.javazoos.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "animals")
public class Animal extends Auditable {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long animalid;

    @Column(nullable = false)
    @Getter
    @Setter
    private String animaltype;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @Setter
    private List<ZooAnimal> zoos;

    public Animal() {}

    public Animal(String animaltype) {
        this.animaltype = animaltype;
    }

}