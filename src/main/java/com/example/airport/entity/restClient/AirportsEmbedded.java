package com.example.airport.entity.restClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportsEmbedded {

    private List<Airport> airports;

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    @Override
    public String toString() {
        return "AirportsEmbedded{" +
                "airports=" + airports +
                '}';
    }
}
