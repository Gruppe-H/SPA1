package com.example.SPA1.Service;

import com.example.SPA1.Entity.Country;
import com.example.SPA1.Repositories.CountryRepository;
import com.example.SPA1.dtos.CountryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService() {
    }

    public CountryDTO getCountriesById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow();
        return new CountryDTO(country);
    }

    public List<CountryDTO> getAllCountries() {
        List<CountryDTO> countries = new ArrayList<>();
        for (Country country : countryRepository.findAll()) {
            countries.add(new CountryDTO(country));
        }
        return countries;
    }


    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(Long id, Country country) {
        if (countryRepository.existsById(id)) {
            country.setCountryId(id);
            return countryRepository.save(country);
        }
        return null; // Handle error or throw an exception if the entity with the given ID doesn't exist
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
