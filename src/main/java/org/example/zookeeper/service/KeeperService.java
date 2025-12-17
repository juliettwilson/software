package org.example.zookeeper.service;

import org.example.zookeeper.entity.Keeper;

import java.util.List;

public interface KeeperService {
    Keeper save(Keeper keeper);

    List<Keeper> findAll();

    Keeper findById(Long id);
    void deleteById(Long id);
}
