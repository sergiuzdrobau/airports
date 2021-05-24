package com.example.airport.service;

import com.example.airport.entity.Airport;
import com.example.airport.repository.AirportRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirportServiceImplTest {

    private AirportRepository airportRepository = mock(AirportRepository.class);
    private AirportService airportService = new AirportServiceImpl(airportRepository);


    @Test
    void findMissingAirport() {
        when(airportRepository.findById(3)).thenReturn(Optional.empty());
        Optional<Airport> response = airportService.getAirportById(3);
        assertTrue(response.isEmpty());
    }

    @Test
    void getByIdExistingAirport(){

        // Given
        Airport expected = new Airport(1,"Henri Coanda", "OTP", "Bucharest");

        // when
        when(airportRepository.findById(3)).thenReturn(Optional.of(expected));
        Optional<Airport> response = airportService.getAirportById(3);
        verify(airportRepository, times(1)).findById(3);
        // then
        assertTrue(response.isPresent());
        assertEquals(expected,response.get());
    }
}