package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.RadarDTO;
import com.example.demo.mapper.RadarMapper;
import com.example.demo.service.RadarService;
import com.example.request.RadarRequest;
import com.example.response.RadarResponse;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
@WebService(serviceName = "RadarWS")
public class RadarControllerSoap {

	@Autowired
	RadarService radarService;
	@Autowired
	RadarMapper radarMapper;
	
	@WebMethod
	public List<RadarResponse> GetAll(){
		List<RadarDTO> radarDTO=radarService.GetAll();
		List<RadarResponse> radarResponses=new ArrayList<>();
		
		for (RadarDTO radarDto2 : radarDTO) {
			radarResponses.add(radarMapper.fromRadarDtoTOresponse(radarDto2));
		}
		return radarResponses;
	}
	
	@WebMethod
	public RadarResponse GetById(@WebParam(name = "id") UUID id){
		RadarDTO radarDTO=radarService.GetById(id);
		RadarResponse radarResponse=radarMapper.fromRadarDtoTOresponse(radarDTO);
		return radarResponse;
	}
	
	@WebMethod
	public RadarResponse SaveRadra(@WebParam(name = "radar") RadarRequest radarRequest){
		RadarDTO radarDTO =radarService.AddRadar(radarMapper.fromRadarRequest(radarRequest));
		RadarResponse radarResponse=radarMapper.fromRadarDtoTOresponse(radarDTO);
		return radarResponse;
	}
	
	@WebMethod
	public RadarResponse UpdateRadra(@WebParam(name = "radar") RadarRequest radarRequest,@WebParam(name = "id") UUID id){
		RadarDTO radarDTO =radarService.UpdateRadar(id,radarMapper.fromRadarRequest(radarRequest));
		return radarMapper.fromRadarDtoTOresponse(radarDTO);
	}
	
	@WebMethod
	public ResponseEntity<Object> Delete(@WebParam(name = "id") UUID id){
		radarService.DeleteRadar(id);
		return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
	}
	
	
}
