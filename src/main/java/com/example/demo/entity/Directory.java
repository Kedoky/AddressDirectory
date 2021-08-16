package com.example.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Directory {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String number;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_person")
    private Person person;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_typesPhone")
    private TypesPhone typesPhone;

    public Directory(){ }

    public Directory(String number, Person person, TypesPhone typesPhone){
        this.number = number;
        this.person = person;
        this.typesPhone = typesPhone;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setTypesPhone(TypesPhone typesPhone){
        this.typesPhone = typesPhone;
    }

    public TypesPhone getTypesPhone() {
        return typesPhone;
    }
}