package com.example.airport.service;

import com.example.airport.entity.restClient.Airport;
import com.example.airport.entity.restClient.AirportsObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@PropertySource("classpath:application.yml")
public class amadeusServiceImpl implements amadeusService{

    @Autowired
    private RestTemplate restTemplate;


    @Value("${AmadeusURL}")
    private String URL;

    @Value("${saveURL}")
    private String saveURL;

    @Override
    public List<Airport> getAllAirports() {
        ResponseEntity<AirportsObject> responseEntity = restTemplate.exchange(URL+"/airports", HttpMethod.GET, null
                , new ParameterizedTypeReference<AirportsObject>() {});
        AirportsObject airports = responseEntity.getBody();
        List<Airport> airports2 = airports.get_embedded().getAirports();

        for (Airport airport : airports2) {
            int id = airport.getId();
            if (id == 0){
                ResponseEntity<String> responseEntity2 = restTemplate.postForEntity(saveURL+"/airports", airport, String.class);
                System.out.println("Airport added");
                System.out.println(responseEntity2.getBody());
            }
            else {
                restTemplate.put(saveURL+"/airports/"+id, airport);
                System.out.println("Airport with id= "+id+" was updated");
            }
        }

        return airports2;
    }


}
