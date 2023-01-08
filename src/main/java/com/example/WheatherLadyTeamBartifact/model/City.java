package com.example.WheatherLadyTeamBartifact.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Long population;

    public City(String name, Long population) {
        this.name = name;
        this.population = population;
    }

    public City(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "regionId", foreignKey = @ForeignKey(name = "fk_city_region_id"))
    @JsonIgnore
    private Region region;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Weather weather;
}
