package com.example.demo.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class TypesPhone {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String typePhone;

    public TypesPhone(){ }

    public TypesPhone(String typePhone){
        this.typePhone = typePhone;
    }

    public TypesPhone(Long id, String typePhone){
        this.id = id;
        this.typePhone = typePhone;
    }

    public void setId(Long id) { this.id = id; }

    public Long getId() { return id; }

    public void setTypePhone(String typePhone){
        this.typePhone = typePhone;
    }

    public String getTypePhone() {
        return typePhone;
    }
}