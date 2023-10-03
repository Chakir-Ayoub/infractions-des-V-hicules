package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ProprieterDto;
import com.example.demo.entity.Propriete;
import com.example.demo.request.ProprieterRequest;
import com.example.demo.response.ProprieterResponse;

@Component
public class Proprietemapper {
	
	private ModelMapper modelMapper=new ModelMapper();
	
	public Propriete fromDTO(ProprieterDto proprieterDto) {
		return modelMapper.map(proprieterDto, Propriete.class);
	}
	
	public ProprieterDto fromRequest(ProprieterRequest proprieterRequest) {
		return modelMapper.map(proprieterRequest, ProprieterDto.class);
	}
	
	public ProprieterResponse fromDtoResponse(ProprieterDto proprieterDto) {
		return modelMapper.map(proprieterDto, ProprieterResponse.class);
	}
	
	public ProprieterDto fromDTOEntity(Propriete propriete) {
		return modelMapper.map(propriete, ProprieterDto.class);
	}
	
}
