package com.example.demo;

import com.example.utils.UserContextInterceptor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Radar;
import com.example.demo.repository.RadarReposirory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

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

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){
		RestTemplate template = new RestTemplate();
		List interceptors = template.getInterceptors();
		if (interceptors==null){
			template.setInterceptors(Collections.singletonList(
					new UserContextInterceptor()));
		}else{
			interceptors.add(new UserContextInterceptor());
			template.setInterceptors(interceptors);
		}
		return template;
	}
}
