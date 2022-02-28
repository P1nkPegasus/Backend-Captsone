package com.backend.charity.controller;

import com.backend.charity.model.Charity;
import com.backend.charity.model.Household;
import com.backend.charity.service.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CharityController {

    private CharityService charityService;

    @Autowired
    public void setCharityService(CharityService charityService) {
        this.charityService = charityService;
    }

    @GetMapping(path = "/hello-world/")
    public String getHelloWorld(){
        return "hello world";
    }

    @GetMapping("/charities/")
    public List<Charity> getAllCharities(){
        System.out.println("calling getAllCharities");
        return charityService.getAllCharities();
    }

    @PostMapping("/charities/")
    public Charity createCharity(@RequestBody Charity charityObject){
        System.out.println("calling createCharity");
        return charityService.createCharity(charityObject);
    }

    @GetMapping("/charities/{charitiesId}/")
    public Optional<Charity> getCharity(@PathVariable (value = "charitiesId") Long charitiesId){
        System.out.println("calling getCharity");
        return charityService.getCharity(charitiesId);
    }

    @PutMapping("/charities/{charitiesId}/")
    public Charity updateCharity(@PathVariable (value = "charitiesId") Long charitiesId,
                                   @RequestBody Charity charityObject){
        System.out.println("calling updateCharity");
        return charityService.updateCharity(charitiesId,charityObject);
    }

    @DeleteMapping("/charities/{charitiesId}/")
    public Optional<Charity> deleteCharity(@PathVariable (value = "charitiesId") Long charitiesId){
        System.out.println("calling deleteCharity");
        return charityService.deleteCharity(charitiesId);
    }

    //HOUSEHOLD

    @GetMapping("/charities/{charitiesId}/households/")
    public List<Household> getAllCharityHousehold(@PathVariable(value = "charityId") Long charityId) {
        System.out.println("calling getAllCharityHousehold...");
        return charityService.getAllCharityHousehold(charityId);
    }

    @PostMapping("/charities/{charitiesId}/households/")
    public Household createCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                            @RequestBody Household householdObject) {
        System.out.println("calling createCharityHousehold");
        return charityService.createCharityHousehold(charityId, householdObject);
    }

    @GetMapping("/charities/{charitiesId}/households/{householdsId}/")
    public Household getCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                         @PathVariable(value = "householdId") Long householdId) {
        System.out.println("calling getCharityHousehold...");
        return charityService.getCharityHousehold(charityId, householdId);
    }

    @PutMapping("/charities/{charitiesId}/households/{householdsId}/")
    public Household updateCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                            @PathVariable(value = "householdId") Long householdId,
                                            @RequestBody Household householdObject) {
        System.out.println("calling updateCharityHousehold");
        return charityService.updateCharityHousehold(charityId, householdId, householdObject);
    }

    @DeleteMapping("/charities/{charitiesId}/households/{householdsId}/")
    public void deleteCharityHousehold(@PathVariable(value = "charityId") Long charityId,
                                       @PathVariable(value = "householdId") Long householdId) {
        System.out.println("calling deleteCharityHousehold");
        charityService.deleteCharityHousehold(householdId, charityId);
    }
}
