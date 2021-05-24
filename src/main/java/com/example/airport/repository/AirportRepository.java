package com.example.airport.repository;

import com.example.airport.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AirportRepository extends JpaRepository<Airport, Integer> {

    @Query(value = "SELECT * FROM airports WHERE iata = ?1", nativeQuery = true)
    Airport getAirportByIata(String iata);

}

