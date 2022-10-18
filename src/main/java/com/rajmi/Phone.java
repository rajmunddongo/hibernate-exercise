package com.rajmi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Phone {
    @Id
    private int ID;
    private String Brand;
    private int VersionNumber;
    @ManyToMany
    private List<Friend> friend;

    public Phone(){}

    public Phone(int ID, String brand, int versionNumber) {
        this.ID = ID;
        Brand = brand;
        VersionNumber = versionNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getVersionNumber() {
        return VersionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        VersionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ID=" + ID +
                ", Brand='" + Brand + '\'' +
                ", VersionNumber=" + VersionNumber +
                '}';
    }

    public List<Friend> getFriend() {
        return friend;
    }

    public void setFriend(List<Friend> friend) {
        this.friend = friend;
    }
}
