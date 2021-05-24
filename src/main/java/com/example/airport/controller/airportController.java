package com.example.airport.controller;

import com.example.airport.entity.Airport;
import com.example.airport.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class airportController {

   @Autowired
   private AirportService airportService;


    @GetMapping("/airports")
    public List<Airport> getAllAirports(){
        return airportService.getAllAirports();
    }

    @GetMapping("/airports/{id}")
    public Optional<Airport> getAirportById(@PathVariable("id") int id){
        Optional<Airport> airport = airportService.getAirportById(id);
        return airport;
    }

    @GetMapping("airports/iata/{iata}")
    public Airport getAirportsByIata(@PathVariable("iata") String iata){
        Airport airport = airportService.getAirportByIata(iata);
        return airport;
    }

    @PostMapping("airports")
    public void saveAirport(@RequestBody Airport airport){
        System.out.println(airport);
        airportService.saveAirport(airport);
    }
}
