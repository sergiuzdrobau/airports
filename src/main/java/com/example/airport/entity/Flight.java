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


    @Column(name = "departure_id")
    private int departureId;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "departure_id", insertable=false, updatable=false)
    private Airport departureAirport;


    @Column(name = "arrival_id")
    private int arrivalId;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "arrival_id", insertable=false, updatable=false)
    private Airport arrivalAirport;


    public Flight() {
    }

    public Flight(int id, String number, int airlineId, int departureId, int arrivalId) {
        this.id = id;
        this.number = number;
        this.airlineId = airlineId;
        this.departureId = departureId;
        this.arrivalId = arrivalId;
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

    public int getDepartureId() {
        return departureId;
    }

    public void setDepartureId(int departureId) {
        this.departureId = departureId;
    }

    public int getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(int arrivalId) {
        this.arrivalId = arrivalId;
    }
}
