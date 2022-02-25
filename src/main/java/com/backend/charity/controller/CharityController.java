package com.backend.charity.controller;

import com.backend.charity.model.Charity;
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
}
