package com.example.SPA1.Repositories;

import com.example.SPA1.Entity.Country;
import com.example.SPA1.dtos.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    // You can add custom query methods if needed

    List<Country> findAll();

    CountryDTO findById(Long countryId);


}
