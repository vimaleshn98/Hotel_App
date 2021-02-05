package com.mindtree.HotelApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.HotelApp.entity.Hotel;
import com.mindtree.HotelApp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/Hotels")
	private List<Hotel> getTrack(){
		return hotelService.getTrack();
	}
	
	
	@PostMapping(value = "/Hotels" )
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return hotelService.addHotel(hotel);
	}

}
