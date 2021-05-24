package com.example.airport.service;

import com.example.airport.entity.Airport;


import java.util.List;
import java.util.Optional;

public interface AirportService {
    List<Airport> getAllAirports();
    Optional<Airport> getAirportById(int id);
    Airport getAirportByIata(String iata);
    void saveAirport(Airport airport);
}
