package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.VehiculeDto;
import com.example.demo.entity.Vehicule;
import com.example.demo.request.VehiculeRequest;
import com.example.demo.response.VehiculeRespnse;

@Component
public class Vehiculemapper {
	
	private ModelMapper modelMapper=new ModelMapper();
	
	public Vehicule fromDto(VehiculeDto vehiculeDto) {return modelMapper.map(vehiculeDto, Vehicule.class);}
	public VehiculeRespnse fromDTOResponse(VehiculeDto vehiculeDto) {return modelMapper.map(vehiculeDto, VehiculeRespnse.class);}
	public VehiculeDto fromRequest(VehiculeRequest vehiculeRequest) {return modelMapper.map(vehiculeRequest, VehiculeDto.class);}
	
	
	
}
