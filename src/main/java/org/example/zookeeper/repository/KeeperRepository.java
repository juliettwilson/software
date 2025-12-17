package org.example.zookeeper.repository;

import org.example.zookeeper.entity.Keeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeeperRepository extends JpaRepository<Keeper, Long> {
}
