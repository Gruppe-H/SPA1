package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_location")
    private String countryLocation;

    @Column(name = "region_id")
    private Long regionId;

    @Column(name = "cdp_region_id")
    private Long cdpRegionId;

}
