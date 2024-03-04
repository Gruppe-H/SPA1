package com.example.SPA1.Entity;

import jakarta.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Emissions")
public class Emission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emission_id")
    private Long emissionId;

    @Column(name = "intensity_unit")
    private int intensityUnit;

    @Column(name = "gasses_included")
    private String gassesIncluded;

    @Column(name = "organization_id")
    private Long organizationId;


}

