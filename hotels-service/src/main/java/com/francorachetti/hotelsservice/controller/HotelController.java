package com.francorachetti.hotelsservice.controller;

import com.francorachetti.hotelsservice.entity.Hotel;
import com.francorachetti.hotelsservice.service.IHotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/{city_id}")
    public List<Hotel> getHotelsByCityId (@PathVariable Long city_id) {
        return hotelService.getHotelbyCityId(city_id);

    }

}
