package com.example.demo.controllers;

import com.example.demo.entity.Town;
import com.example.demo.services.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TownController {
    @Autowired
    private TownService townService;

    @GetMapping("/town.html")
    public String ShowTown(Model model) {
        Iterable<Town> towns =  townService.GetTown();
        model.addAttribute("Towns", towns);
        return "town.html";
    }

    @PostMapping("/town.html")
    public String AddTown(Town town) {
        townService.AddTown(town);
        return "redirect:/town.html";
    }

    @PostMapping("/editTown")
    public String EditTown(Town town, @RequestParam String mode) {
        if (mode.equals("delete")) {
            townService.DeleteTown(town);
        } else if (mode.equals("update")) {
            townService.UpdateTown(town);
        }
        return "redirect:/town.html";
    }
}