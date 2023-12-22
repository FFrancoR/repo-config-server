package com.francorachetti.hotelsservice.service;

import com.francorachetti.hotelsservice.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HotelService implements IHotelService {

    List<Hotel> hotels = Arrays.asList(
            new Hotel(1L, "Paradise", 5, 1L),
            new Hotel(2L, "Sunset View", 4, 2L),
            new Hotel(3L, "Ocean Breeze", 3, 3L),
            new Hotel(4L, "Mountain Retreat", 4, 1L),
            new Hotel(5L, "City Lights Inn", 3, 2L),
            new Hotel(6L, "Riverside Lodge", 4, 3L),
            new Hotel(7L, "Cozy Cabin Resort", 2, 1L),
            new Hotel(8L, "Luxury Haven", 5, 2L),
            new Hotel(9L, "Historic Grand Hotel", 4, 3L),
            new Hotel(10L, "Tranquil Gardens", 3, 1L)
    );



    //METODO!!
    @Override
    public List<Hotel> getHotelbyCityId(Long city_id) {

        List<Hotel> hotelCityList = new ArrayList<Hotel>();


        //busca si coincide la id
        for (Hotel h : hotels) {
            if (h.getCity_id().equals(city_id)) {
                hotelCityList.add(h);
            }

        }

        return hotelCityList;
    }




}
