package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProprieterDto;
import com.example.demo.entity.Propriete;
import com.example.demo.mapper.Proprietemapper;
import com.example.demo.repository.ProprieteRepository;
import com.example.demo.service.proprieteService;

 @Service
public class ProprieteServiceImpl implements proprieteService {

	@Autowired
	private ProprieteRepository proprieteRepository;
	@Autowired
	private Proprietemapper proprietemapper;
	@Override
	public List<ProprieterDto> GetAll() {
		// TODO Auto-generated method stub
		List<Propriete> proprietes=proprieteRepository.findAll();
		List<ProprieterDto> dtos=new ArrayList<>();

		for (Propriete propriete : proprietes) {
			dtos.add(proprietemapper.fromDTOEntity(propriete));
		}
		return dtos;
	}

	@Override
	public ProprieterDto AddPropriete(ProprieterDto proprieterDto) {
		// TODO Auto-generated method stub
		Propriete propriete=proprietemapper.fromDTO(proprieterDto);
		Propriete propriete2= proprieteRepository.save(propriete);
		return proprietemapper.fromDTOEntity(propriete2);
	}

	@Override
	public ProprieterDto GetById(Long id) {
		// TODO Auto-generated method stub
		Propriete propriete=proprieteRepository.findById(id).get();
		
		return proprietemapper.fromDTOEntity(propriete);
	}

	@Override
	public void RemovePropriete(Long id) {
		// TODO Auto-generated method stub
		Propriete propriete=proprieteRepository.findById(id).get();
		proprieteRepository.delete(propriete);
	}

	@Override
	public ProprieterDto updateproprieter(ProprieterDto proprieterDto, Long id) {
		// TODO Auto-generated method stub
		
		Propriete propriete=proprieteRepository.findById(id).get();
		propriete.setDateNaissance(proprieterDto.getDateNaissance());
		propriete.setEmail(proprieterDto.getEmail());
		propriete.setNom(proprieterDto.getNom());
		propriete.setPrenom(proprieterDto.getPrenom());
		
		Propriete propriete2=proprieteRepository.save(propriete);
		
		return proprietemapper.fromDTOEntity(propriete2);
	}

}
