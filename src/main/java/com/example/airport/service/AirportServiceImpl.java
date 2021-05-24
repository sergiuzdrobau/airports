package com.example.airport.service;

import com.example.airport.entity.Airport;
import com.example.airport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirportService {


    private AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Optional<Airport> getAirportById(int id) {
       return airportRepository.findById(id);
    }

    @Override
    public Airport getAirportByIata(String iata) {
        return airportRepository.getAirportByIata(iata);
    }

    @Override
    public void saveAirport(Airport airport) {
        airportRepository.save(airport);
    }


}
