package com.rajmi;

import jakarta.persistence.Embeddable;

@Embeddable
public class Job {
    String CompanyName;
    String Location;

    public Job(int ID, String companyName, String location) {
        CompanyName = companyName;
        Location = location;
    }

    public Job() {
    }


    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Job{" +
                ", CompanyName='" + CompanyName + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
