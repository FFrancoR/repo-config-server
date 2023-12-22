package com.francorachetti.citiesservice.controller;

import com.francorachetti.citiesservice.dto.CityDTO;
import com.francorachetti.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {


    private final ICityService cityService;

    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name, @RequestParam String country) {

        return cityService.getCitiesHotels(name, country);

    }
}
