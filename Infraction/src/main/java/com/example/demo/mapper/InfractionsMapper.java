package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.entity.Infractions;
import com.example.demo.request.InfractionsReqieust;
import com.example.demo.response.InfractionsResponse;
import com.example.demo.stub.InfractionServiceOuterClass;

@Component
public class InfractionsMapper {
	
	private ModelMapper modelMapper=new ModelMapper();
	
	public Infractions frominfractionDto(InfractionsDTO infractionsDTO) {
		return modelMapper.map(infractionsDTO, Infractions.class);
	}
	
	public InfractionsDTO frominfractionRequest(InfractionsReqieust infractionsReqieust) {
		return modelMapper.map(infractionsReqieust, InfractionsDTO.class);
	}
	
	public InfractionsResponse InfractionDtoToResponse(InfractionsDTO infractionsDTO) {
		return modelMapper.map(infractionsDTO, InfractionsResponse.class);
	}
	
	public InfractionsDTO frominfractionsDtoToEntity(Infractions infractions) {
		return modelMapper.map(infractions, InfractionsDTO.class);
	}
	
	public InfractionServiceOuterClass.Infraction fromInfractionEntity(Infractions infractions){
		return modelMapper.map(infractions, InfractionServiceOuterClass.Infraction.Builder.class).build();
	}
	
	public InfractionServiceOuterClass.Infraction fromInfractionResponse(InfractionsDTO infractionsResponse){
		return modelMapper.map(infractionsResponse, InfractionServiceOuterClass.Infraction.Builder.class).build();
	}
	
	public InfractionServiceOuterClass.Infraction fromInfractionResponse2(InfractionsResponse infractionsResponse){
		return modelMapper.map(infractionsResponse, InfractionServiceOuterClass.Infraction.Builder.class).build();
	}

	
	public Infractions fromInfractionRequest(InfractionServiceOuterClass.InfractionRequest infractionRequest) {
		return modelMapper.map(infractionRequest, Infractions.class);
	}
}
