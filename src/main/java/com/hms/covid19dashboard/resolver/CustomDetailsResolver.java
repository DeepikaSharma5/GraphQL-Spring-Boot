package com.hms.covid19dashboard.resolver;

import com.hms.covid19dashboard.entity.CustomDetails;
import com.hms.covid19dashboard.service.CustomDetailsService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
class CustomDetailsQueryResolver implements GraphQLQueryResolver {

    public final CustomDetailsService customDetailsService;

    public CustomDetailsQueryResolver(CustomDetailsService customDetailsService) {
        this.customDetailsService = customDetailsService;
    }

    public List<CustomDetails> findAll(){
        return customDetailsService.findAll();
    }

    public Optional<CustomDetails> findById(Long id){
        return customDetailsService.findById(id);
    }

}

@Component
class CustomDetailsMutationResolver implements GraphQLMutationResolver {

    public final CustomDetailsService customDetailsService;

    public CustomDetailsMutationResolver(CustomDetailsService customDetailsService) {
        this.customDetailsService = customDetailsService;
    }

    public CustomDetails createDetails(String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered){
            return customDetailsService.createDetails(email, country, new_cases, total_deaths, total_recovered);
    }

    public Boolean deleteDetails(Long id){
        return customDetailsService.deleteDetails(id);
    }

    public CustomDetails updateDetails(Long id,String email, String country, Integer new_cases, Integer total_deaths, Integer total_recovered){
        return customDetailsService.updateDetails(id, email, country, new_cases, total_deaths, total_recovered);
    }

}
