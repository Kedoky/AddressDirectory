package com.example.demo.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Street {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String streetName;

    public Street() { }

    public Street(String streetName) {
        this.streetName = streetName;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() { return id; }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }
}