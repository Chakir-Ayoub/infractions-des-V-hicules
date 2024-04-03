package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Infractions;
import com.example.demo.repository.InfractionsRepository;

@SpringBootApplication
@EnableFeignClients
public class InfractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	CommandLineRunner start(InfractionsRepository infractionsRepository) {
		return args ->{
			infractionsRepository.save(new Infractions(null,LocalDate.now(),Long.valueOf(1),Long.valueOf(500),Long.valueOf(120),Long.valueOf(5),Float.valueOf((float) 500.0)));
			infractionsRepository.save(new Infractions(null,LocalDate.now(),Long.valueOf(1),Long.valueOf(500),Long.valueOf(120),Long.valueOf(5),Float.valueOf((float) 900.0)));
			infractionsRepository.save(new Infractions(null,LocalDate.now(),Long.valueOf(1),Long.valueOf(5000),Long.valueOf(1200),Long.valueOf(5),Float.valueOf((float)500.0)));

		};
	}
}
