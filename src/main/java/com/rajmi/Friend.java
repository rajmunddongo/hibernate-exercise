package com.rajmi;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Friend {
    @Id
    int id;
    String SurName;
    String GivenName;

    public Friend(int id, String surName, String givenName) {
        this.id = id;
        SurName = surName;
        GivenName = givenName;
    }

    public Friend() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }
}
