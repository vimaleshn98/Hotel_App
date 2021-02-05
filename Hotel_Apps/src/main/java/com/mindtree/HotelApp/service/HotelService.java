package com.mindtree.HotelApp.service;

import java.util.List;

import com.mindtree.HotelApp.entity.Hotel;

public interface HotelService {

	List<Hotel> getTrack();

	Hotel addHotel(Hotel hotel);

}
