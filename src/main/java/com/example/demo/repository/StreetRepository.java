package com.example.demo.repository;

import com.example.demo.entity.Street;
import org.springframework.data.repository.CrudRepository;

public interface StreetRepository extends CrudRepository<Street, Long> {
    Iterable<Street> findAllByOrderById();
}
