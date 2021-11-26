package com.example.rentMyCar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentMyCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentMyCarApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, CarRepository carRepository) {
		return (args) -> {
			Person tintin = new Person();
			tintin.setAge(20);
			tintin.setNom("Tintin");

			Car car = new Car();
			car.setRented(false);
			car.setBrand("Ferrrari");
			car.setPlateNumber("11AA22");
			car.setPrice(1000);

			car.setPerson(tintin);
			tintin.setCar(car);

			Dates dates = new Dates();
			dates.setBegin("25/11/2021");
			dates.setEnd("25/12/2021");

			car.setDates(dates);
			dates.setCar(car);

			carRepository.save(car);

		};
	}

}
