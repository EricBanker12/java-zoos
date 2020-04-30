package com.lambdaschool.javazoos.services;

import java.util.ArrayList;
import java.util.List;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repositories.ZooRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

    @Autowired
    private ZooRepository zoorepos;

    @Override
    public List<Zoo> findAll() {
        List<Zoo> zooList = new ArrayList<>();
        zoorepos.findAll()
            .iterator()
            .forEachRemaining(zoo -> zooList.add(zoo));
        return zooList;
    }

    @Override
    public Zoo findById(long id) {
        return zoorepos.findById(id).get();
    }

}