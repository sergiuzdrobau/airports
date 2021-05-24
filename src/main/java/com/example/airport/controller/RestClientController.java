package com.example.airport.controller;


import com.example.airport.entity.restClient.Airport;
import com.example.airport.service.amadeusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("amadeus/api/")
public class RestClientController {

    @Autowired
    private amadeusService amadeusService;

    @GetMapping("/airports")
    public List<Airport> getAllAirports(){
        List<Airport> airports = amadeusService.getAllAirports();
        return airports;
    }
}
