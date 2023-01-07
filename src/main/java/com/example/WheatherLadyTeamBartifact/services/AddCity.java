package com.example.WheatherLadyTeamBartifact.services;

import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AddCity {

    private final CityRepo cityRepository;



    public void addCity(String city){
        City citynew = new City();
        citynew.setName(city);
        cityRepository.save(citynew);

    }


}

