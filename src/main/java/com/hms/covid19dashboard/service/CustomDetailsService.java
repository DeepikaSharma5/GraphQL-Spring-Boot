package com.hms.covid19dashboard.service;

import com.hms.covid19dashboard.entity.CustomDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomDetailsService {

    List<CustomDetails> findAll();

    CustomDetails createDetails(String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered);

    Boolean deleteDetails(Long id);

    CustomDetails updateDetails(Long id,String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered);

    //CustomDetails findById(Long id);
    Optional<CustomDetails> findById(Long id);

    Optional<CustomDetails> findByCountry(String country);

}
