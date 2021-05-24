package com.example.airport.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @NotEmpty
    @Column(name = "name")
    private String name;

    @Size(min = 3, max = 3)
    @Column(name = "iata")
    private String iata;

    @NotEmpty
    @Column(name = "city")
    private String city;




    @OneToMany(mappedBy = "departureAirport", cascade = CascadeType.ALL)
    private List<Flight> departureFlights;




    @OneToMany(mappedBy = "arrivalAirport", cascade = CascadeType.ALL)
    private List<Flight> arrivalFlights;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Id == airport.Id && Objects.equals(name, airport.name) && Objects.equals(iata, airport.iata) && Objects.equals(city, airport.city) && Objects.equals(departureFlights, airport.departureFlights) && Objects.equals(arrivalFlights, airport.arrivalFlights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, iata, city, departureFlights, arrivalFlights);
    }

    public Airport() {
    }

    public Airport(int Id, String name, String iata, String city) {
        this.Id = Id;
        this.name = name;
        this.iata = iata;
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", iata='" + iata + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
