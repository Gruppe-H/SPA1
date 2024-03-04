package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "accounting_year")
    private int accountingYear;

    @Column(name = "C40_member")
    private boolean c40Member;

    @Column(name = "GCoM_member")
    private boolean GCoMMember;

    @Column(name = "organization_boundary")
    private String organizationBoundary;


    @Column(name = "city_id")
    private Long cityId;

}
