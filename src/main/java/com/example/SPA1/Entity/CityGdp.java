package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "City_GDPs")
public class CityGdp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gdp_id")
    private Long gdpId;

    @Column(name = "gdp")
    private int gdp;

    @Column(name = "gdp_currency")
    private String gdpCurrency;

    @Column(name = "gdp_source")
    private String gdpSource;

    @Column(name = "city_id")
    private Long cityId;

}
