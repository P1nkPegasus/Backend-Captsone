package com.backend.charity.repository;


import com.backend.charity.model.Charity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CharityRepository extends JpaRepository<Charity, Long> {
    Charity findByName(String charityName);

}
