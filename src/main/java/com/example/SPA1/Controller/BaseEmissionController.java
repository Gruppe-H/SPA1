package com.example.SPA1.Controller;

import com.example.SPA1.Entity.BaseEmissions;
import com.example.SPA1.Service.BaseEmissionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/base-emissions")
public class BaseEmissionController {
    private final BaseEmissionService baseEmissionService;

    @Autowired
    public BaseEmissionController(BaseEmissionService baseEmissionService) {
        this.baseEmissionService = baseEmissionService;
    }

    @GetMapping("/{id}")
    public BaseEmissions getBaseEmissionsById(@PathVariable Long id) {
        return baseEmissionService.getBaseEmissionById(id);
    }

    @GetMapping
    public List<BaseEmissions> getAllBaseEmission() {
        return baseEmissionService.getAllBaseEmission();
    }

    @PostMapping
    public BaseEmissions createBaseEmissions(@RequestBody BaseEmissions baseEmissions) {
        return baseEmissionService.createBaseEmission(baseEmissions);
    }

    @PutMapping("/{id}")
    public BaseEmissions updateBaseEmissions(@PathVariable Long id, @RequestBody BaseEmissions baseEmissions) {
        return baseEmissionService.updateBaseEmission(id, baseEmissions);
    }

    @DeleteMapping("/{id}")
    public void deleteBaseEmissions(@PathVariable Long id) {
        baseEmissionService.deleteBaseEmissions(id);
    }
}

