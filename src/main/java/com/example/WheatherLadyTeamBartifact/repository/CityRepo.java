package com.example.WheatherLadyTeamBartifact.repository;
import com.example.WheatherLadyTeamBartifact.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CityRepo extends JpaRepository <City, UUID> {
    public City getCityByName (String cityName);
}
