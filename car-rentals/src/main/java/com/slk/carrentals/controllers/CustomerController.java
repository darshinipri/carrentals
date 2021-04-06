package com.slk.carrentals.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.slk.carrentals.dto.RentalRatesDto;
import com.slk.carrentals.dto.ResponseDto;
import com.slk.carrentals.entities.BookingDetails;
import com.slk.carrentals.entities.Car;
import com.slk.carrentals.service.CustomerDetailsService;

@RestController
@RequestMapping(value="/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDetailsService service;
	
	@Autowired
	private RentalRatesDto ratesdto;
	

	 @GetMapping(value="/rate/{id}")
	 public ResponseDto getRentalRates(@PathVariable int id) {
	 List<Car> rate = service.rateDetails(id,ratesdto);
	 return new ResponseDto(false,rate);
	 }

	 @GetMapping(value="/bookingDetails/customerId")
	 public ResponseDto getbookingDetails(@PathVariable int id) {
	 List<BookingDetails> rate = service.bookingDetails(id); 
	 return new ResponseDto(false,rate);

	 }
	 
	 @GetMapping(value="/rates")
	 public ResponseDto ratesBasedOnCategory() {
	 List<Car> rate = service.ratesBasedOnCategory(); 
	 return new ResponseDto(false,rate);

	 }
	 
	 
	 
}