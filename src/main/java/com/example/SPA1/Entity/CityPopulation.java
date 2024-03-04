package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "City_Populations")
public class CityPopulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "population_id")
    private Long populationId;

    @Column(name = "population_amount")
    private int populationAmount;

    @Column(name = "population_year")
    private int populationYear;

    @Column(name = "city_id")
    private Long cityId;
}
