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
@Table(name = "zoos")
public class Zoo extends Auditable {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long zooid;

    @Column(nullable = false)
    @Getter
    @Setter
    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL)
    private List<Telephone> telephones;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL)
    private List<ZooAnimal> zooanimals;

    public Zoo() {}

    public Zoo(String name) {
        zooname = name;
    }

}