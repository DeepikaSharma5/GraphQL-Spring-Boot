package com.hms.covid19dashboard.repository;

import com.hms.covid19dashboard.entity.CustomDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomDetailsRepository extends JpaRepository<CustomDetails,Long> {
   Optional<CustomDetails> findByCountry(String country);
}
