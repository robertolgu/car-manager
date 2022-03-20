package com.vexiza.carmanager;

import com.vexiza.carmanager.model.car.Car;
import com.vexiza.carmanager.model.car.CarType;
import com.vexiza.carmanager.repository.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CarManagerApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.carRepository.save(new Car("CODE1", "COCHE 1", (float)100.2, (int) 220, new Date("11/08/2019"), CarType.CAR));
		this.carRepository.save(new Car("CODE2", "COCHE 2", (float)178.2, (int) 220, new Date("21/08/2020"), CarType.CAR));
		this.carRepository.save(new Car("CODE3", "COCHE 3", (float)555.5, (int) 220, new Date("13/03/2020"), CarType.CAR));
		this.carRepository.save(new Car("CODE4", "MOTO 1", (float)100.2, (int) 255, new Date("22/02/2022"), CarType.MOTORBIKE));
		this.carRepository.save(new Car("CODE5", "MOTO 2", (float)89, (int) 188, new Date("30/08/2018"), CarType.MOTORBIKE));
	}
}