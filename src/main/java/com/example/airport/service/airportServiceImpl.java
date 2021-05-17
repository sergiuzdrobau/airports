package com.example.airport.service;

import com.example.airport.entity.Airport;
import com.example.airport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class airportServiceImpl implements airportService{

    @Autowired
    private AirportRepository airportRepository;



    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(int id) {
        return null;
    }
}
