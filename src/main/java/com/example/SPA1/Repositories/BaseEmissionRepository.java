package com.example.SPA1.Repositories;


import com.example.SPA1.Entity.BaseEmissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseEmissionRepository extends JpaRepository<BaseEmissions, Long> {
    // Add custom query methods if needed

}
