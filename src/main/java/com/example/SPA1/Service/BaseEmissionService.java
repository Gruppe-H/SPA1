package com.example.SPA1.Service;

import com.example.SPA1.Entity.BaseEmissions;
import com.example.SPA1.Repositories.BaseEmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseEmissionService {

    private BaseEmissionRepository baseEmissionsRepository;

    public BaseEmissionService() {

    }
    public BaseEmissions getBaseEmissionById(Long id) {
        return baseEmissionsRepository.findById(id).orElse(null);
    }

    public BaseEmissions createBaseEmission(BaseEmissions baseEmissions) {
        return baseEmissionsRepository.save(baseEmissions);
    }

    public BaseEmissions updateBaseEmission(Long id, BaseEmissions baseEmissions) {
        baseEmissions.setId(id);
        return baseEmissionsRepository.save(baseEmissions);
    }

    public void deleteBaseEmissions(Long id) {
        baseEmissionsRepository.deleteById(id);
    }
    public List<BaseEmissions> getAllBaseEmission() {
        return baseEmissionsRepository.findAll();
    }

}
