package com.slk.carrentals.service;

import java.util.List;

import com.slk.carrentals.dto.RentalRatesDto;
import com.slk.carrentals.entities.BookingDetails;
import com.slk.carrentals.entities.Car;



public interface CustomerDetailsService {
	
	public List<Car> rateDetails(int id, RentalRatesDto ratesdto);

	
	public List<BookingDetails> bookingDetails(int id);
	
	public List<Car> ratesBasedOnCategory();


}