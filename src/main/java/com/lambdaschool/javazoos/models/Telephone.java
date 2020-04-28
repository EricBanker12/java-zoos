package com.lambdaschool.javazoos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long phoneid;

    @Column(nullable = false)
    @Getter
    @Setter
    private String phonetype;

    @Column(nullable = false)
    @Getter
    @Setter
    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    @Getter
    @Setter
    private Zoo zoo;

    public Telephone() {}

    public Telephone(String phonetype, String phonenumber, Zoo zoo) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zoo = zoo;
    }

}