package com.example.demo.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_streets__town")
    private StreetsInTown streets_town;

    @NonNull
    private int numberHouse;

    @NonNull
    private int numberFlat;

    public Address() { }

    public Address(StreetsInTown streets_town, int numberHouse, int numberFlat) {
        this.streets_town = streets_town;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStreetsTown(StreetsInTown streets_town){
        this.streets_town = streets_town;
    }

    public StreetsInTown getStreetsTown() {
        return streets_town;
    }

    public void setNumberHouse(int numberHouse){
        this.numberHouse = numberHouse;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberFlat(int numberFlat){
        this.numberFlat = numberFlat;
    }

    public int getNumberFlat() {
        return numberFlat;
    }
}