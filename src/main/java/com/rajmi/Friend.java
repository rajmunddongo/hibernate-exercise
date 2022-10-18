package com.rajmi;


import jakarta.persistence.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity(name="friend")
@Table(name="friend_table")
public class Friend {
    @Id
    int id;
    String SurName;
    String GivenName;
    Job job;
    @ManyToMany(mappedBy="friend")
    List<Phone> phone= new ArrayList<>();

    public Friend(int id, String surName, String givenName, Job job) {
        this.id = id;
        SurName = surName;
        GivenName = givenName;
        this.job = job;
    }

    public Friend(int id, String surName, String givenName, Job job, List<Phone> phone) {
        this.id = id;
        SurName = surName;
        GivenName = givenName;
        this.job = job;
        this.phone = phone;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", SurName='" + SurName + '\'' +
                ", GivenName='" + GivenName + '\'' +
                ", job=" + job +
                ", phone=" + phone +
                '}';
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
}
