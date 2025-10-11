package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import com.example.demo.dto.RadarDto;
import com.example.demo.feign.InfractionRestClient;
import com.example.demo.model.Radar;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.apache.naming.java.javaURLContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.entity.Infractions;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.repository.InfractionsRepository;
import com.example.demo.service.InfractionsService;

@Service
public class InfractionserviceImpl  {
	
	@Autowired
	private InfractionsRepository infractionsRepository;
	@Autowired
	private InfractionsMapper infractionsMapper;
	@Autowired
	private InfractionRestClient infractionRestClient;
	private static final Logger logger = LoggerFactory.getLogger(InfractionserviceImpl.class);
	private static final String token="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJfd01jOEhENU83VVpjMURQSFIteTZLcklRTm1KUGNTVjBCcDB3eE91YmVJIn0.eyJleHAiOjE3NjAxOTQ2OTgsImlhdCI6MTc2MDE5NDM5OCwianRpIjoiMWM2ZjQ3MWEtY2E0Mi00NWQ4LWEzZGItYzU1ODBmZjRmZDI2IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9zcG1pYS1yZWFsbSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0MzBmZTllNC0wM2MzLTQwN2MtYjIyNy03ZjE5NzRkNTY5YjUiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJvc3RvY2siLCJzaWQiOiI1NmNiMTQyYi00YWI2LTRjYjYtYWU1OC05ODMxMGUwNmMyYjciLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHA6Ly9sb2NhbGhvc3Q6ODA4My8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtc3BtaWEtcmVhbG0iLCJ1bWFfYXV0aG9yaXphdGlvbiIsIm9zdG9jay1hZG1pbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im9zdG9jayI6eyJyb2xlcyI6WyJBRE1JTiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjaGFraXJhIiwiZW1haWwiOiJheW91Yi5jaGFraXJAb3V0bG9vay5mciJ9.Vuou8i4872RCNtqJrWHJc9OVVjHfNtX5YM2kTGvTqiJVBv5cu94_0IV_D8W_BqoThbq1L68hJRuyVfyFG_mEflpd7NYEgj8Y9efh8IxQPbDRCxeXbmJ1GIJS4jclAJuzuf1wc2YtkXURpFEuT80t-W6gfGjOI_dOZL7jL7U0lvr393VYRyU6VmHDMYM7JYEzxiZweWcGLhLe4PTnqURiVIhFrZva7DZ4h9vlKvC8bKmW-rDiapjzdx9wQsDglKKyhjzYVJaj_uuZxQmqWnO8Tjkc9Y-CIuhbBrvVzUjfl3w0fegI742SQhM6tKUddnlWHqGqyb9F7JBN03oKGIpGCw";
	public List<InfractionsDTO> GetAll() {
		// TODO Auto-generated method stub
		List<Infractions> infractions=infractionsRepository.findAll();
		List<InfractionsDTO> infractionsDTOs=new ArrayList<>();
		for (Infractions infractions2 : infractions) {
			infractionsDTOs.add(infractionsMapper.frominfractionsDtoToEntity(infractions2));
		}
		return infractionsDTOs;
	}


	public InfractionsDTO GetById(Long id) {
		// TODO Auto-generated method stub
		Infractions infractions=infractionsRepository.findById(id).get();
		
		return infractionsMapper.frominfractionsDtoToEntity(infractions);
	}

	public InfractionsDTO SaveInfraction(InfractionsDTO infractionsDTO) {
		// TODO Auto-generated method stub
		
		Infractions infractions=infractionsMapper.frominfractionDto(infractionsDTO);
		Infractions infractions2=  infractionsRepository.save(infractions);
		
		return infractionsMapper.frominfractionsDtoToEntity(infractions2);
	}

	public InfractionsDTO UpdateInfraction(InfractionsDTO infractionsDTO, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void DeleteInfraction(Long id) {
		// TODO Auto-generated method stub
		Infractions infractions=infractionsRepository.findById(id).get();
		infractionsRepository.delete(infractions);

	}
	private void randomlyRunLong(){
		Random random=new Random();
		int randomNum=random.nextInt(3)+1;
		if(randomNum==3) sleep();
	}
	private void sleep(){
		try {
			Thread.sleep(5000);
			throw new java.util.concurrent.TimeoutException();
		}catch (InterruptedException | TimeoutException e){
			System.out.println("*//*/*/////////**************");
			System.out.println(e.getMessage());
		}
	}
	@CircuitBreaker(name = "InfractionserviceImpl",
			fallbackMethod = "buildFallbackInfractionserviceImpl")
	@Retry(name = "InfractionserviceImpl",
			fallbackMethod = "getAllRadarFallback")
	@Bulkhead(name = "bulkheadInfractionService",
			fallbackMethod = "buildFallbackInfractionserviceImpl")
	public List<Radar> GetAllRadar() throws TimeoutException{
		randomlyRunLong();

		return this.infractionRestClient.getRadar("Bearer " + token);
	}

	private List<Radar> getAllRadarFallback(Throwable t) {
		logger.warn("⚠️ Fallback Retry activé à cause de : {}", t.getMessage());
		List<Radar> fallbackList = new ArrayList<>();
		Radar radar = new Radar();
		radar.setLatitude(0F);
		radar.setLangitude(0F);
		radar.setMaxVitesse(0);
		fallbackList.add(radar);
		return fallbackList;
	}

}
