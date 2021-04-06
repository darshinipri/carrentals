package com.slk.carrentals.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailsDto {

	private int bookingDetailsId;
	
	private Date rentFrom;

	private Date rentTo;
	
	private Date bookingDate;

	private Date bookingPerPeriod;
}
