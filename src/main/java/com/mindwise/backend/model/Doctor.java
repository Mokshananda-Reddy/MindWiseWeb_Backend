package com.mindwise.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Doctor {

    public Long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Long doctorID) {
        this.doctorID = doctorID;
    }

    @Id
    @GeneratedValue
    private Long doctorID;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String gender;
    private String username;
    private Integer status;
    private String registeredID;
    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, Date dob, String gender, String username, Integer status, String registeredID, String specialization) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.username = username;
        this.status = status;
        this.registeredID = registeredID;
        this.specialization = specialization;
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

    public String getRegisteredID() {
        return registeredID;
    }

    public void setRegisteredID(String registeredID) {
        this.registeredID = registeredID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
