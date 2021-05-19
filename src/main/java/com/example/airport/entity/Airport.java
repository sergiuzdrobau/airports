package com.example.airport.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "iata")
    private String iata;

    @Column(name = "city")
    private String city;




    @OneToMany(mappedBy = "departureAirport", cascade = CascadeType.ALL)
    private List<Flight> departureFlights;




    @OneToMany(mappedBy = "arrivalAirport", cascade = CascadeType.ALL)
    private List<Flight> arrivalFlights;





    public Airport() {
    }

    public Airport(int Id, String name, String iata, String city) {
        this.Id = Id;
        this.name = name;
        this.iata = iata;
        this.city = city;
    }

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

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", iata='" + iata + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
