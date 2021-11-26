package com.example.rentMyCar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    String nom;
    int age;

    @Id
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
