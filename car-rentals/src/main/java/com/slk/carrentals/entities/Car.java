package com.slk.carrentals.entities;

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
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;

	private String brand;

	private String model;

	@Column(name = "registration_number")
	private String registrationNumber;

	private String availability;

	@Column(name = "carcategory_name")
	private String carCategoryName;

	private String seating;

	private double dailyCost;

	@Column(name = "late_charges")
	private double lateCharges;

}
