package com.example.demo.repository;

import com.example.demo.entity.Town;
import org.springframework.data.repository.CrudRepository;

public interface TownRepository extends CrudRepository<Town, Long> {
    Iterable<Town> findAllByOrderById();
}
