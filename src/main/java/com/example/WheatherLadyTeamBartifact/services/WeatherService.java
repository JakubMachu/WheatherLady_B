package com.example.WheatherLadyTeamBartifact.services;

import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import com.example.WheatherLadyTeamBartifact.repository.WeatherRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class WeatherService {

    private final WeatherRepo weatherRepo;



}
