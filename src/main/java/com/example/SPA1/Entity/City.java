package com.example.SPA1.Entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "city_location")
    private String cityLocation;

    @Column(name = "average_altitude")
    private String averageAltitude;

    @Column(name = "average_temp")
    private String averageTemp;

    @Column(name = "country_id")
    private Long countryId;


}
