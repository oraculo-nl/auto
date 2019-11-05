package com.example.demo.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    private String merk;

    public Auto() {
    }

    public Auto(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }





}
