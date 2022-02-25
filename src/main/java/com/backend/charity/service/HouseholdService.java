package com.backend.charity.service;

import com.backend.charity.repository.CharityRepository;
import com.backend.charity.repository.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseholdService {
    private HouseholdRepository householdRepository;

    @Autowired
    public void setHouseholdRepository(HouseholdRepository householdRepository){
        this.householdRepository = householdRepository;
    }

}
