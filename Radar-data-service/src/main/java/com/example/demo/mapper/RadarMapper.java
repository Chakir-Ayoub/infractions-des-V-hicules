package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.RadarDTO;
import com.example.demo.entity.Radar;
import com.example.demo.service.RadarService;
import com.example.demo.stub.RadarServiceOuterClass;
import com.example.request.RadarRequest;
import com.example.response.RadarResponse;

@Component
public class RadarMapper {

	private ModelMapper modelMapper=new ModelMapper();
	
	public Radar fromRadarDto(RadarDTO radarDTO) {
		return modelMapper.map(radarDTO, Radar.class);
	}
	
	public RadarDTO fromRadar(Radar radar) {
		return  modelMapper.map(radar, RadarDTO.class);
	}
	
	public RadarResponse fromRadarDtoTOresponse(RadarDTO radarDTO) {
		return modelMapper.map(radarDTO, RadarResponse.class);
	}
	
	public RadarDTO fromRadarRequest(RadarRequest radarRequest) {
		return modelMapper.map(radarRequest, RadarDTO.class);
	}
	
	public RadarServiceOuterClass.Radar fromRadarEntity(Radar radar){
		return modelMapper.map(radar, RadarServiceOuterClass.Radar.Builder.class).build();
	}
	
	public RadarServiceOuterClass.Radar fromRadarResponse(RadarResponse radar){
		return modelMapper.map(radar, RadarServiceOuterClass.Radar.Builder.class).build();
	}
	
	public Radar fromGrpcRadarRequest(RadarServiceOuterClass.RadarRequest radarRequest) {
		return modelMapper.map(radarRequest, Radar.class);
	}
}
