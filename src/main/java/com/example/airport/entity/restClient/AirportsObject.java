package com.example.airport.entity.restClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportsObject {


    private AirportsEmbedded _embedded;

    public AirportsEmbedded get_embedded() {
        return _embedded;
    }

    public void set_embedded(AirportsEmbedded _embedded) {
        this._embedded = _embedded;
    }

    @Override
    public String toString() {
        return "AirportsObject{" +
                "_embedded=" + _embedded +
                '}';
    }
}


