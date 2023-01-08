package com.example.WheatherLadyTeamBartifact.repository;
import com.example.WheatherLadyTeamBartifact.model.City;
import com.example.WheatherLadyTeamBartifact.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface RegionRepo extends JpaRepository <Region, UUID> {
}
