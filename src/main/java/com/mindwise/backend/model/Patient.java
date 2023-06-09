package com.mindwise.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long patientID;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String gender;
    private String username;
    private Integer status;

    public Patient() {
    }

    public Patient(String name, Date dob, String gender, String username) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.username = username;
        this.status = 1;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
