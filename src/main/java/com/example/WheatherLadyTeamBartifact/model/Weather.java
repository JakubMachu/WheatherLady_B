package com.example.WheatherLadyTeamBartifact.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID weatherId;
    private long celsius;
    private long precipitationInMillimeters;
    private long windSpeed;
    private int bioLoad;

//    @OneToOne(mappedBy = "weather", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Weather> weather = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private City city;


}
