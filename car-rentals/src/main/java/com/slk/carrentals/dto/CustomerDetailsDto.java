package com.slk.carrentals.dto;

import java.util.List;
import com.slk.carrentals.entities.BookingDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsDto {

private int customerId;
	
	private String customerName;
	
	private String contactNumber;

	private String email;

	private String address;
	
	private int DLNnumber;
	
	private List<BookingDetails> bookingDetails;
	
}
