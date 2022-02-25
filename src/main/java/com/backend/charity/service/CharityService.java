package com.backend.charity.service;

import com.backend.charity.exceptions.InformationExistException;
import com.backend.charity.exceptions.InformationNotFoundException;
import com.backend.charity.model.Charity;
import com.backend.charity.repository.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Charity charity = charityRepository.findByName(charityObject.getName());
        if (charity != null) {
            throw new InformationExistException("Charity with name " + charity.getName() + " already exists");
        } else {
            return charityRepository.save(charityObject);
            //throw exception if there is charity with same name
        }

    }

    public Optional<Charity> getCharity(Long charityId) {
        System.out.println("service calling getCharity...");
        Optional<Charity> charity = charityRepository.findById(charityId);
        if (charity.isPresent()) {
            return charity;
        } else {
            throw new InformationNotFoundException("charity with id " + charityId + " not found");
        }
    }

    public Charity updateCharity(Long charityId, Charity charityObject) {
        System.out.println("service calling updateCharity...");

        Optional<Charity> charity = charityRepository.findById(charityId);
        if (charity.isPresent()) {
            if (charityObject.getName().equals(charity.get().getName())) {
                System.out.println("Same");
                throw new InformationExistException("charity " + charity.get().getName() + "  already exists");
            } else {
                Charity updateCharity = charityRepository.findById(charityId).get();
                updateCharity.setName(charityObject.getName());
                updateCharity.setAddress(charityObject.getAddress());
                updateCharity.setCity(charityObject.getCity());
                updateCharity.setState(charityObject.getState());
                updateCharity.setPhoneNumber(charityObject.getPhoneNumber());
                updateCharity.setWebsite(charityObject.getWebsite());
                return charityRepository.save(updateCharity);
            }
        } else {
            throw new InformationNotFoundException("charity with id " + charityId + " not found");
        }

    }

    public Optional<Charity> deleteCharity(Long charityId) {
        System.out.println("service calling deleteCharity...");

        Optional<Charity> charity = charityRepository.findById(charityId);

        if (charity.isPresent()) {
            charityRepository.deleteById(charityId);
            return charity;
        } else {
            throw new InformationNotFoundException("charity with id " + charityId + " not found");
        }
    }
}
