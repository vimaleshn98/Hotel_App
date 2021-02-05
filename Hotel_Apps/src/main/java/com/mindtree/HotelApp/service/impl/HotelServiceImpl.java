package com.mindtree.HotelApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.HotelApp.dao.HotelDao;
import com.mindtree.HotelApp.entity.Hotel;
import com.mindtree.HotelApp.service.HotelService;

public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelDao hoteldao;
	@Override
	public List<Hotel> getTrack() {
		// TODO Auto-generated method stub
		return hoteldao.getTrack();
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hoteldao.addHotel(hotel);
	}

}
