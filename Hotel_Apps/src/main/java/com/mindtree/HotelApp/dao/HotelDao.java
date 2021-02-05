package com.mindtree.HotelApp.dao;

import java.util.List;

import com.mindtree.HotelApp.entity.Hotel;

public interface HotelDao {

	Hotel addHotel(Hotel hotel);

	List<Hotel> getTrack();

}
