package com.example.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String surName;

    @NotNull
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_address")
    private Address address;

    public Person() { }

    public Person(String firstName, String surName, String lastName, Address address) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.address = address;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setLastName(String lastName){ this.lastName = lastName; }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
