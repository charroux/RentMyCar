package com.example.rentMyCar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	
	private String plateNumber;
	private String brand;
	private int price;
	boolean rented;
	Dates dates;
	Person person;

	@OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Car() {
		super();
	}
	
	public Car(String plateNumber, String brand, int price) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.price = price;
	}

	@Id
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	@OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "Car{" +
				"plateNumber='" + plateNumber + '\'' +
				", brand='" + brand + '\'' +
				", price=" + price +
				", rented=" + rented +
				'}';
	}


}
