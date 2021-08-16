package com.example.demo.services;

import com.example.demo.entity.Town;
import com.example.demo.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TownService {
    @Autowired
    private TownRepository townRepository;

    public Iterable<Town> GetTown() {
        return townRepository.findAllByOrderById();
    }

    public void AddTown(Town town) {
        townRepository.save(town);
    }

    public void DeleteTown(Town town) {
        townRepository.delete(town);
    }

    public void UpdateTown(Town town) {
        townRepository.save(town);
    }
}