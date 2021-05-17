package com.example.airport.service;

import com.example.airport.entity.Airport;


import java.util.List;

public interface airportService {
    public List<Airport> getAllAirports();
    public Airport getAirportById(int id);
}
