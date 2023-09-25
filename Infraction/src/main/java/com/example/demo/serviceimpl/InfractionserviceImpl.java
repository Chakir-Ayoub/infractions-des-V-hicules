package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.entity.Infractions;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.repository.InfractionsRepository;
import com.example.demo.service.InfractionsService;

@Service
public class InfractionserviceImpl implements InfractionsService {
	
	@Autowired
	private InfractionsRepository infractionsRepository;
	@Autowired
	private InfractionsMapper infractionsMapper;
	
	@Override
	public List<InfractionsDTO> GetAll() {
		// TODO Auto-generated method stub
		List<Infractions> infractions=infractionsRepository.findAll();
		List<InfractionsDTO> infractionsDTOs=new ArrayList<>();
		for (Infractions infractions2 : infractions) {
			infractionsDTOs.add(infractionsMapper.frominfractionsDtoToEntity(infractions2));
		}
		return infractionsDTOs;
	}

	@Override
	public InfractionsDTO GetById(Long id) {
		// TODO Auto-generated method stub
		Infractions infractions=infractionsRepository.findById(id).get();
		
		return infractionsMapper.frominfractionsDtoToEntity(infractions);
	}

	@Override
	public InfractionsDTO SaveInfraction(InfractionsDTO infractionsDTO) {
		// TODO Auto-generated method stub
		
		Infractions infractions=infractionsMapper.frominfractionDto(infractionsDTO);
		Infractions infractions2=  infractionsRepository.save(infractions);
		
		return infractionsMapper.frominfractionsDtoToEntity(infractions2);
	}

	@Override
	public InfractionsDTO UpdateInfraction(InfractionsDTO infractionsDTO, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteInfraction(Long id) {
		// TODO Auto-generated method stub
		Infractions infractions=infractionsRepository.findById(id).get();
		infractionsRepository.delete(infractions);

	}

}
