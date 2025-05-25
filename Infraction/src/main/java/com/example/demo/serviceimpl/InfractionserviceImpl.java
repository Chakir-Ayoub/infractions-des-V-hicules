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
		return this.infractionRestClient.getRadar();
	}

	private List<Radar> buildFallbackInfractionserviceImpl(Throwable t) {
		List<Radar> fallbackList=new ArrayList<>();
		Radar radar=new Radar();
		radar.setLatitude(Float.valueOf(52.62F));
		radar.setLangitude(Float.valueOf(52.62F));
		radar.setMaxVitesse(Integer.valueOf(52));
		fallbackList.add(radar);
		return fallbackList;
	}
}
