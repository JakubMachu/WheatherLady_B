package com.example.WheatherLadyTeamBartifact.services;

import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import com.example.WheatherLadyTeamBartifact.repository.RegionRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepo cityRepository;
    private final RegionRepo regionRepo;

    public void addCity(String city) {
        cityRepository.save(new City(city));
    }

    public void deleteEvidence(UUID id) {
        cityRepository.delete(cityRepository.getReferenceById(id));
    }

    public UUID getIdFromCityName(String cityName) {
        return cityRepository.getCityByName(cityName).getId();
    }
   public City getCityByCityName(String cityName) {
        return cityRepository.getCityByName(cityName);
    }

    public List<City> gettAllCitiesByRegion(String cityName) {
        return regionRepo.getReferenceById(cityRepository.getCityByName(cityName).getRegion().getRegionId()).getCities();
    }

    public void updateCity(City city) {
         cityRepository.saveAndFlush(city);
    }


}
