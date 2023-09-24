package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RadarDTO;
import com.example.demo.entity.Radar;
import com.example.demo.mapper.RadarMapper;
import com.example.demo.service.RadarService;
import com.example.request.RadarRequest;
import com.example.response.RadarResponse;

@RestController
public class RadarControllerGraphQl {
	
	@Autowired
	private RadarService radarService;
	@Autowired
	private RadarMapper radarMapper;
	
	@QueryMapping
	public List<RadarResponse> allRadars(){
		List<RadarDTO> radarDTOs=radarService.GetAll();
		List<RadarResponse> radarResponses=new ArrayList<>();
		for (RadarDTO radarDTO : radarDTOs) {
			RadarResponse radarResponse=radarMapper.fromRadarDtoTOresponse(radarDTO);
			radarResponses.add(radarResponse);
		}
		return radarResponses;
	}
	
	@QueryMapping
	public RadarResponse RadarById(@Argument UUID id) {
		RadarDTO radarDTO=radarService.GetById(id);
		return radarMapper.fromRadarDtoTOresponse(radarDTO);
	}
	
	@MutationMapping
	public ResponseEntity<RadarResponse> saveRadar(@Argument RadarRequest radar){
		RadarDTO radarDTO =radarService.AddRadar(radarMapper.fromRadarRequest(radar));
		return new ResponseEntity<RadarResponse>(radarMapper.fromRadarDtoTOresponse(radarDTO),HttpStatus.OK);
	}
}
