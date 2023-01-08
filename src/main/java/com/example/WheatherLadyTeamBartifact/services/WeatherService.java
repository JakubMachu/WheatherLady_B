package com.example.WheatherLadyTeamBartifact.services;

import com.example.WheatherLadyTeamBartifact.model.Weather;
import com.example.WheatherLadyTeamBartifact.repository.CityRepo;
import com.example.WheatherLadyTeamBartifact.repository.WeatherRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor

public class WeatherService {

    private final WeatherRepo weatherRepo;

    public Weather createWeather() {

        String monthName = LocalDate.now().getMonth().name();
        int monthOrd = LocalDate.now().getMonth().ordinal()+1;

        Weather weather = new Weather();

        if (2 >= monthOrd || monthOrd > 10) {
            weather.setCelsius(rand(-15,10));
        } else if ((monthOrd == 3) || (monthOrd == 4) || (monthOrd == 9) || (monthOrd == 10)) {
            weather.setCelsius(rand(-5,20));
        } else {
            weather.setCelsius(rand(5,45));
        }

        weather.setPrecipitationInMillimeters(rand(0,45));
        weather.setWindSpeed(rand(0,40));
        weather.setBioLoad(rand(1,3));
        var temper =weather.getCelsius();
        var windSpeed =weather.getWindSpeed();
        var bioload =weather.getBioLoad();
        return new Weather();

    }
    private int rand(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));

    }

}


