package com.lambdaschool.javazoos.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
    name = "zooanimals",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"zooid", "animalid"})}
)
@EqualsAndHashCode(callSuper = false)
@ToString
public class ZooAnimal extends Auditable implements Serializable {

    /** Increment on schema change.
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @Getter
    @Setter
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @Getter
    @Setter
    private Animal animal;

    public ZooAnimal() {}

    public ZooAnimal(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

}