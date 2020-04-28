package com.lambdaschool.javazoos.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "zoos")
public class Zoo {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long zooid;

    @Column(nullable = false)
    @Getter
    @Setter
    private String zooname;

    @OneToMany(mappedBy = "zoo")
    private List<Telephone> telephones;

    @ManyToMany
    @JoinTable(name = "zooanimals")
    private List<Animal> animals;

    public Zoo() {}

    public Zoo(String name) {
        zooname = name;
    }

}