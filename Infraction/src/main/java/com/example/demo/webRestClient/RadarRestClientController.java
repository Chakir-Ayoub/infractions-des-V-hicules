package com.example.demo.webRestClient;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.feign.InfractionRestClient;
import com.example.demo.model.Radar;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/radar-service")
public class RadarRestClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private InfractionRestClient infractionRestClient;
	
	@GetMapping("/radars")
	public List<Radar> ListRadar(){
		Radar[] radar=restTemplate.getForObject("http://RADAR/Radar", Radar[].class);
		return List.of(radar);
	}
	
	@GetMapping("/radar/{id}")
	public Radar RadarById(@PathVariable UUID id) {
		Radar radar=restTemplate.getForObject("http://RADAR/Radar/"+id, Radar.class);
		return radar;
	}
	
}
