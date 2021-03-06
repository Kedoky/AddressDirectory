package com.example.demo.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Town {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String townName;

    public Town() { }

    public Town(String townName) {
        this.townName = townName;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTownName(String townName){
        this.townName = townName;
    }

    public String getTownName() {
        return townName;
    }
}