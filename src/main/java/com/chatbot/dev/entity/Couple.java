package com.chatbot.dev.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Couple {

    @Id
    private int id;

    @OneToOne
    private Customer customerA;

    @OneToOne
    private Customer customerB;
}
