package org.example.zookeeper.service;

import org.example.zookeeper.entity.Animal;

import java.util.List;

public interface AnimalService {
    Animal save(Animal animal);

    List<Animal> findAll();

    Animal findById(Long id);
    void deleteById(Long id);
}
