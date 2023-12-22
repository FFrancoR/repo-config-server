package com.francorachetti.citiesservice.service;


import com.francorachetti.citiesservice.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}
