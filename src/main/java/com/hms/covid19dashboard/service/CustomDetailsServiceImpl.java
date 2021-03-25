package com.hms.covid19dashboard.service;

import com.hms.covid19dashboard.entity.CustomDetails;
import com.hms.covid19dashboard.repository.CustomDetailsRepository;
import graphql.GraphQLException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomDetailsServiceImpl implements CustomDetailsService{

    private final CustomDetailsRepository customDetailsRepository;

    public CustomDetailsServiceImpl(CustomDetailsRepository customDetailsRepository) {
       this.customDetailsRepository = customDetailsRepository;
    }

    @Override
    public List<CustomDetails> findAll() {
        return customDetailsRepository.findAll();
    }

    @Override
    public Optional<CustomDetails> findById(Long id) {
        return customDetailsRepository.findById(id);
    }

    @Override
    public CustomDetails createDetails(String email, String country, Integer new_cases,
                                       Integer total_deaths, Integer total_recovered) {
        if(customDetailsRepository.findByCountry(country).isPresent()){
            throw new GraphQLException("Country details already exist");
        }
        CustomDetails customDetails = new CustomDetails();
        customDetails.setEmail(email);
        customDetails.setCountry(country);
        customDetails.setNew_cases(new_cases);
        customDetails.setTotal_deaths(total_deaths);
        customDetails.setTotal_recovered(total_recovered);
        return customDetailsRepository.save(customDetails);
    }

    @Override
    public Boolean deleteDetails(Long id) {
        customDetailsRepository.findById(id);
        return true;
    }

    @Override
    public CustomDetails updateDetails(Long id,String email, String country, Integer new_cases,
                                       Integer total_deaths, Integer total_recovered) {
        CustomDetails customDetails = customDetailsRepository.findById(id).get();
        customDetails.setEmail(email);
        customDetails.setCountry(country);
        customDetails.setNew_cases(new_cases);
        customDetails.setTotal_deaths(total_deaths);
        customDetails.setTotal_recovered(total_recovered);
        return customDetailsRepository.save(customDetails);
    }


    @Override
    public Optional<CustomDetails> findByCountry(String country) {
       return customDetailsRepository.findByCountry(country);
    }
}
