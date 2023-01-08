package com.example.WheatherLadyTeamBartifact.repository;

import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WeatherRepo extends JpaRepository<Weather, UUID> {


}
