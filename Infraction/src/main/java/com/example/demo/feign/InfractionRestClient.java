package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Radar;

@FeignClient(url = "http://localhost:8083/Radar",value = "infraction-rest-client")
public interface InfractionRestClient {
	@GetMapping("")
	List<Radar> getRadar();
	@GetMapping("/radar/{id}")
	Radar getRadarById(@PathVariable(name = "id") Long id);
}
