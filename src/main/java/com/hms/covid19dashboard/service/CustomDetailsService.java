package com.hms.covid19dashboard.service;

import com.hms.covid19dashboard.entity.CustomDetails;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

public interface CustomDetailsService {

    List<CustomDetails> findAll();

    CustomDetails createDetails(String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered);

    Boolean deleteDetails(Long id);

    CustomDetails updateDetails(Long id,String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered);

    Optional<CustomDetails> findById(Long id);

    Optional<CustomDetails> findByCountry(String country);

}
