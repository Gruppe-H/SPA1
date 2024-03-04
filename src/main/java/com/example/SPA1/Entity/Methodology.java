package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Methodologies")
public class Methodology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "methodology_id")
    private Long methodologyId;

    @Column(name = "primary_methodology")
    private String primaryMethodology;

    @Column(name = "details")
    private String details;

    @Column(name = "emission_id")
    private Long emissionId;
}
