package com.backend.charity.repository;

import com.backend.charity.model.Charity;
import com.backend.charity.model.Household;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
//    List<Household> findAll(Long charityId);

//    Household findByName(String name);

    Optional<Household> findByName(String name);
}
