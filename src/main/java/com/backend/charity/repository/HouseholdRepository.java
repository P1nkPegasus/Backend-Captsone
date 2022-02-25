package com.backend.charity.repository;

import com.backend.charity.model.Charity;
import com.backend.charity.model.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
}
