package com.example.WheatherLadyTeamBartifact.services;

import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CityService {

    private final CityRepo cityRepository;

    public CityService(CityRepo cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void DeleteEvidence(UUID id){

        cityRepository.delete(cityRepository.getReferenceById(id));
    }

}
