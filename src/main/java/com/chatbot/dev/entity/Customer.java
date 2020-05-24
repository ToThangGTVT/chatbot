package com.chatbot.dev.entity;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String gender;

    @OneToOne
    private Couple couple;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Couple getCouple() {
        return couple;
    }

    public void setCouple(Couple couple) {
        this.couple = couple;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
