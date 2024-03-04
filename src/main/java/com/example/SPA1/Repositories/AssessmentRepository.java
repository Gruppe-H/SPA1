package com.example.SPA1.Repositories;

import com.example.SPA1.Entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
    // Define custom repository methods if needed
}

