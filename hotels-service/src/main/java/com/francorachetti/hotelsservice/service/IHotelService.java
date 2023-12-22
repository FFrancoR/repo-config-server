package com.francorachetti.hotelsservice.service;

import com.francorachetti.hotelsservice.entity.Hotel;

import java.util.List;

public interface IHotelService {
    public List<Hotel> getHotelbyCityId(Long city_id);
}
