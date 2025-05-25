package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Propriete;
import com.example.demo.entity.Vehicule;
import com.example.demo.repository.ProprieteRepository;
import com.example.demo.repository.VehiculeRepository;

@SpringBootApplication
public class ProprieteVehiculeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProprieteVehiculeApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(ProprieteRepository proprieteRepository,VehiculeRepository vehiculeRepository) {
		return args ->{
			proprieteRepository.save(new Propriete(null,"Chakir","Ayoub","chakir@gmail.com",LocalDate.now(),null));
			proprieteRepository.save(new Propriete(null,"Chakir","Najoua","Najoua@gmail.com",LocalDate.now(),null));
			proprieteRepository.save(new Propriete(null,"Chakir","Maroua","Maroua@gmail.com",LocalDate.now(),null));

			vehiculeRepository.save(new Vehicule(null,"matricule1", "Marque1", Long.valueOf(2010), Long.valueOf(500), null));
			vehiculeRepository.save(new Vehicule(null,"matricule2", "Marque2", Long.valueOf(2015), Long.valueOf(600), null));
			vehiculeRepository.save(new Vehicule(null,"matricule3", "Marque3", Long.valueOf(2020), Long.valueOf(700), null));

		};
	}

}
