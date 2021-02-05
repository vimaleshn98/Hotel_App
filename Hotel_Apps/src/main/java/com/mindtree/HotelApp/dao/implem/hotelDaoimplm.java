package com.mindtree.HotelApp.dao.implem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.HotelApp.dao.HotelDao;
import com.mindtree.HotelApp.entity.Hotel;
import com.mindtree.HotelApp.repository.HotelRepository;

public class hotelDaoimplm implements HotelDao {
	@Autowired
	HotelRepository hotelrepo;

	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getTrack() {
		// TODO Auto-generated method stub
		return hotelrepo.findAll();
	}

}
