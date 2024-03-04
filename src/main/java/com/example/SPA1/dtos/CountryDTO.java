package com.example.SPA1.dtos;

import com.example.SPA1.Entity.Country;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CountryDTO {
    private Long countryId;
    private String countryName;
    private String countryLocation;
    private Long regionId;
    private Long cdpRegionId;

    public CountryDTO(Country country) {
        this.countryId = country.getCountryId();
        this.countryName = country.getCountryName();
        this.countryLocation = country.getCountryLocation();
        this.regionId = country.getRegionId();
        this.cdpRegionId = country.getCdpRegionId();
    }
}
