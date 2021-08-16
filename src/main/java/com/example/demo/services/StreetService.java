package com.example.demo.services;

import com.example.demo.entity.Street;
import com.example.demo.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;

    public Iterable<Street> GetStreet() {
        return streetRepository.findAll();
    }

    public void AddStreet(Street street) {
        streetRepository.save(street);
    }

    public void DeleteStreet(Street street) {
        streetRepository.delete(street);
    }

    public void UpdateStreet(Street street) {
        streetRepository.save(street);
    }
}
