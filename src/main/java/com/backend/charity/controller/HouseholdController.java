package com.backend.charity.controller;

import com.backend.charity.model.Household;
import com.backend.charity.service.CharityService;
import com.backend.charity.service.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class HouseholdController {

    private HouseholdService householdService;

    @Autowired
    public void setHouseholdService(HouseholdService householdService) {
        this.householdService = householdService;
    }

    @GetMapping("/charities/{charitiesId}/households/")
    public List<Household> getAllCharityHousehold(@PathVariable(value = "householdId") Long householdId) {
        System.out.println("calling getAllCharityHousehold...");
        return householdService.getAllCharityHousehold(householdId);
    }

    @GetMapping("/charities/{charitiesId}/households/{householdsId}/")
    public Household getCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                      @PathVariable(value = "householdId") Long householdId) {
        System.out.println("calling getCharityHousehold...");
        return householdService.getCharityHousehold(charityId, householdId);
    }

    @PostMapping("/charities/{charitiesId}/households/")
    public Household createCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                         @RequestBody Household householdObject) {
        System.out.println("calling createCharityHousehold");
        return householdService.createCharityHousehold(charityId, householdObject);
    }

    @PutMapping("/charities/{charitiesId}/households/{householdsId}/")
    public Household updateCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                         @PathVariable(value = "householdId") Long householdId,
                                         @RequestBody Household householdObject) {
        System.out.println("calling updateCharityHousehold");
        return householdService.updateCharityHousehold(charityId, householdId, householdObject);
    }

    @DeleteMapping("/charities/{charitiesId}/households/{householdsId}/")
    public void deleteCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                      @PathVariable(value = "householdId") Long householdId) {
        System.out.println("calling deleteCharityHousehold");
        householdService.deleteCharityHousehold(householdId, charityId);
    }
}
