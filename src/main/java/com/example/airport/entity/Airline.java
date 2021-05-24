package com.example.airport.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airlines")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "airline", cascade = CascadeType.ALL)
    private List<Flight> flights;


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airline() {
    }

    public Airline(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }
}
