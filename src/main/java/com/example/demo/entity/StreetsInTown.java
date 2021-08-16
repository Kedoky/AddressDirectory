package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class StreetsInTown {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_town")
    private Town town;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_street")
    private Street street;

    public StreetsInTown() { }

    public StreetsInTown(Town town, Street street) {
        this.town = town;
        this.street = street;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTown(Town town){
        this.town = town;
    }

    public Town getTown() {
        return town;
    }

    public void setStreet(Street street){
        this.street = street;
    }

    public Street getStreet() {
        return street;
    }
}