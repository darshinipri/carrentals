package com.slk.carrentals.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.carrentals.dao.CustomerDetailsDao;
import com.slk.carrentals.dto.RentalRatesDto;
import com.slk.carrentals.entities.BookingDetails;
import com.slk.carrentals.entities.Car;
import com.slk.carrentals.exceptions.RentalException;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	private CustomerDetailsDao dao;

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> rateDetails(int id, RentalRatesDto ratesdto) {
		List<Car> cost = dao.rateDetails(id);
		ratesdto.setDaily(cost.get(0).getDailyCost());
		ratesdto.setHours(cost.get(0).getDailyCost()/24);
		ratesdto.setWeekly(cost.get(0).getDailyCost()/7);
		ratesdto.setMonthly(cost.get(0).getDailyCost()/30);
		return (List<Car>) ratesdto;
	}

	@Override
	public List<BookingDetails> bookingDetails(int id) {
		List<BookingDetails> details = dao.bookingDetails(id);
		if(details ==null) {
			throw new RentalException("ÏD not found");
		}
		
		return details;
	}

	@Override
	public List<Car> ratesBasedOnCategory() {
		List<Car> details = dao.ratesBasedOnCategory();
		return details;
	}


	
}
