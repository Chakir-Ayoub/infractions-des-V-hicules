package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Radar;
import com.example.demo.repository.RadarReposirory;

@SpringBootApplication
public class RadarDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarDataServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(RadarReposirory radarReposirory) {
		return args ->{
			radarReposirory.save(new Radar(null,120,50.0f,20.52f));
			radarReposirory.save(new Radar(null,180,59.0f,20.52f));
			radarReposirory.save(new Radar(null,220,80.0f,20.52f));

		};
	}

}
