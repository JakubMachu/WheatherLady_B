package com.example.WheatherLadyTeamBartifact.repository;
import com.example.WheatherLadyTeamBartifact.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CityRepo extends JpaRepository <City, UUID> {
}
