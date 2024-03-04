package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Target_Types")
public class TargetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_of_target_id")
    private Long typeOfTargetId;

    @Column(name = "type_of_target")
    private String typeOfTarget;

    @Column(name = "target_emission_id")
    private Long targetEmissionId;

}
