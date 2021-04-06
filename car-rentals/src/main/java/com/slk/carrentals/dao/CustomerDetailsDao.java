package com.slk.carrentals.dao;

import java.util.List;

import com.slk.carrentals.entities.BookingDetails;
import com.slk.carrentals.entities.Car;


public interface CustomerDetailsDao {
	
	public List<Car> rateDetails(int id);
	
	public List<BookingDetails> bookingDetails(int id);
	
	public List<Car> ratesBasedOnCategory();

}
