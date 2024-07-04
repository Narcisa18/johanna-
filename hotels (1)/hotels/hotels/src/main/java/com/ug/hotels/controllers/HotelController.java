package com.ug.hotels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ug.hotels.model.Hotel;
import com.ug.hotels.services.HotelService;

@RestController
public class HotelController {
	private HotelService hotelService;

	@GetMapping("hotels")
	public List<Hotel> search() {
		return hotelService.search();

	}

}