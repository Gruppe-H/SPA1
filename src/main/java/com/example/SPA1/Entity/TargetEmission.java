package com.example.SPA1.Entity;

import jakarta.persistence.*;

import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Target_Emissions")
public class TargetEmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "target_emission_id")
    private Long targetEmissionId;

    @Column(name = "pct_reduction_target")
    private int pctReductionTarget;

    @Column(name = "target_year")
    private int targetYear;

    @Column(name = "baseline_year")
    private int baselineYear;

    @Column(name = "estimated_business_as_usual")
    private int estimatedBusinessAsUsual;

    @Column(name = "target_boundary")
    private String targetBoundary;

    @Column(name = "emission_id")
    private Long emissionId;


    private List<TargetType> targetTypes;

}
