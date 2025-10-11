package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Radar;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "http://localhost:8083/api/v1/radar",value = "infraction-rest-client")
public interface InfractionRestClient {
	@GetMapping("")
	List<Radar> getRadar(@RequestHeader("Authorization") String authorizationHeader);
	@GetMapping("/radar/{id}")
	Radar getRadarById(@PathVariable(name = "id") Long id);
}
