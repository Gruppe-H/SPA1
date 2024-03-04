package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Base_Emissions")
public class BaseEmissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "base_emission_id")
    private Long baseEmissionId;

    @Column(name = "reporting_year")
    private Integer reportingYear;

    @Column(name = "sector")
    private String sector;

    @Column(name = "baseline_year")
    private Integer baselineYear;

    @Column(name = "baseline_emissions")
    private Double baselineEmissions;

    @Column(name = "emission_id")
    private Long emissionId;

    public void setId(Long id) {
        baseEmissionId = id;
    }

}
