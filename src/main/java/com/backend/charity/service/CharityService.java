package com.backend.charity.service;

import com.backend.charity.model.Charity;
import com.backend.charity.repository.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //talks to charity repo
public class CharityService {

    private CharityRepository charityRepository;

    @Autowired
    public void setCharityRepository(CharityRepository charityRepository){
        this.charityRepository = charityRepository;
    }


    public List<Charity> getAllCharities() {
        System.out.println("service calling getAllCharities...");
        return charityRepository.findAll();
    }

    public Charity createCharity(Charity charityObject){
        System.out.println("service calling createCharity...");
        return null;

    }

    public Charity getCharity(Long charityId) {
        System.out.println("service calling getCharity...");
//            return charity;
        return null;
    }

    public Charity updateCharity(Long charityId, Charity charityObject) {
        System.out.println("service calling updateCharity...");
        return null;

    }

    public String deleteCharity(Long charityId) {
        System.out.println("service calling deleteCharity...");
        return null;
    }
}
