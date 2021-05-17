package com.example.airport.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number")
    private String number;

    @Column(name = "airline_id")
    private int airlineId;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "airline_id", insertable=false, updatable=false)
    private Airline airline;

    @Column(name = "departure_iata")
    private String departureIata;

    @Column(name = "arrival_iata")
    private String arrivalIata;


    public Flight() {
    }

    public Flight(int id, String number, int airlineId, String departureIata, String arrivalIata) {
        this.id = id;
        this.number = number;
        this.airlineId = airlineId;
        this.departureIata = departureIata;
        this.arrivalIata = arrivalIata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getDepartureIata() {
        return departureIata;
    }

    public void setDepartureIata(String departureIata) {
        this.departureIata = departureIata;
    }

    public String getArrivalIata() {
        return arrivalIata;
    }

    public void setArrivalIata(String arrivalIata) {
        this.arrivalIata = arrivalIata;
    }
}
