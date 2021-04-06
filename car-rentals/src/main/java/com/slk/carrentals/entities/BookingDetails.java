package com.slk.carrentals.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="booking_details")
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_details_id")
	private int bookingDetailsId;
	
	@Column(name="rent_from")
	private Date rentFrom;
	
	@Column(name="rent_to")
	private Date rentTo;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="booking_per_period")
	private Date bookingPerPeriod;
	
	


}
