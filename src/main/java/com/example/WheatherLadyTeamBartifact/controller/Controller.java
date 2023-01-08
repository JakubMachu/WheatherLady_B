package com.example.WheatherLadyTeamBartifact.controller;

import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.model.Region;
import com.example.WheatherLadyTeamBartifact.model.DTO.UpdateCityDTO;
import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import com.example.WheatherLadyTeamBartifact.repository.RegionRepo;
import com.example.WheatherLadyTeamBartifact.services.CityService;
import com.example.WheatherLadyTeamBartifact.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final CityService cityService;
    private final CityRepo cityRepo;
    private final WeatherService weatherService;
    private final RegionRepo regionRepo;

    @PostMapping("/add")
    public ResponseEntity create(@RequestBody String cityName){
      weatherService.createWeather();

      cityService.addCity(cityName);
        return new ResponseEntity<>("City added", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity getAll(@RequestBody String cityName){
        cityService.gettAllCitiesByRegion(cityName);
        return new ResponseEntity<>(cityService.gettAllCitiesByRegion(cityName), HttpStatus.OK);
    }
    @DeleteMapping("/del")
    public ResponseEntity delete(@RequestBody String cityName){
        try {
            cityService.deleteEvidence(cityService.getIdFromCityName(cityName));
        }catch (Exception e){
            return new ResponseEntity<>("City not found", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("City deleted", HttpStatus.OK);
    }
   @PostMapping("/update")
    public ResponseEntity update(@RequestBody UpdateCityDTO cityDTO){
        String statusOk = "City " + cityDTO.getOld() + " renamed to " + cityDTO.getNewN();
        try {
            City city = cityService.getCityByCityName(cityDTO.getOld());
            city.setName(cityDTO.getNewN());
            cityService.updateCity(city);
            Region region = new Region();
            region.setName("asd");
            city.setRegion(region);
            regionRepo.save(region);
            cityService.updateCity(city);
        }catch (Exception e){
            return new ResponseEntity<>("City " + cityDTO.getOld() + " does not exist", HttpStatus.BAD_REQUEST);
        }
       return new ResponseEntity<>(statusOk, HttpStatus.OK);
   }

}
