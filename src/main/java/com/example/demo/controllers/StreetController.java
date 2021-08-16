package com.example.demo.controllers;

import com.example.demo.entity.Street;
import com.example.demo.services.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StreetController {
    @Autowired
    private StreetService streetService;

    @GetMapping("/street.html")
    public String ShowStreet(Model model) {
        Iterable<Street> streets =  streetService.GetStreet();
        model.addAttribute("Streets", streets);
        return "street.html";
    }

    @PostMapping("/street.html")
    public String AddStreet(Street street) {
        streetService.AddStreet(street);
        return "redirect:/street.html";
    }

    @PostMapping("/editStreet")
    public String EditStreet(Street street, @RequestParam String mode) {
        if (mode.equals("delete")) {
            streetService.DeleteStreet(street);
        } else if (mode.equals("update")) {
            streetService.UpdateStreet(street);
        }
        return "redirect:/street.html";
    }
}