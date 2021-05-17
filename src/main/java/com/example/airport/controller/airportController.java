package com.example.airport.controller;

import com.example.airport.entity.Airport;
import com.example.airport.service.airportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("/api")
public class airportController {

   @Autowired
   private airportService airportService;

    @GetMapping("/airports")
    public List<Airport> getAllAirports(){
        return airportService.getAllAirports();

    }

    @GetMapping("/airports/{id}")
    public Airport getAirportById(@PathVariable("id") int id){
        Airport airport = airportService.getAirportById(id);
        return airport;
    }
}
