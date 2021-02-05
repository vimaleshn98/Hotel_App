package com.mindtree.HotelApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.HotelApp.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
