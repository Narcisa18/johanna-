package com.ug.hotels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ug.hotels.model.Hotel;
import com.ug.hotels.respositories.HotelRepository;

@Service
public class HotelService {

	private final HotelRepository hotelRepository;

	public HotelService(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	public void guardarHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	public List<Hotel> search() {
		throw new UnsupportedOperationException("Unimplemented method 'seach'");
	}
}
