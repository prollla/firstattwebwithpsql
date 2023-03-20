package com.example.firstatt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "color")
    private String color;
    public Station() {

    }
    public Station(String color) {
        this.color=color;

    }

    public long getId(){
        return id;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }
}
