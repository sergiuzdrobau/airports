package com.example.airport.entity.restClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

    private int id;
    private String name;
    private String iata;
    private String city;

    public Airport() {
    }

    public Airport(String name, String iata, String city) {
        this.name = name;
        this.iata = iata;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", iata='" + iata + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
