package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RadarDTO;
import com.example.demo.mapper.RadarMapper;
import com.example.demo.service.RadarService;
import com.example.request.RadarRequest;
import com.example.response.RadarResponse;

@RestController
@RequestMapping("Radar")
public class RadarController {
	
	@Autowired
	RadarService radarService;
	@Autowired
	RadarMapper radarMapper;
	
	@GetMapping
	public List<RadarResponse> GetAll(){
		List<RadarDTO> radarDTO=radarService.GetAll();
		List<RadarResponse> radarResponses=new ArrayList<>();
		
		for (RadarDTO radarDto2 : radarDTO) {
			radarResponses.add(radarMapper.fromRadarDtoTOresponse(radarDto2));
		}
		return radarResponses;
		
	}
	
	@GetMapping(path = "{id}")
	public ResponseEntity<RadarResponse> GetById(@PathVariable UUID id){
		RadarDTO radarDTO=radarService.GetById(id);
		return new ResponseEntity<RadarResponse>(radarMapper.fromRadarDtoTOresponse(radarDTO),HttpStatus.ACCEPTED);
	}
	
	@PostMapping
	public ResponseEntity<RadarResponse> SaveRadra(@RequestBody RadarRequest radarRequest){
		RadarDTO radarDTO =radarService.AddRadar(radarMapper.fromRadarRequest(radarRequest));
		return new ResponseEntity<RadarResponse>(radarMapper.fromRadarDtoTOresponse(radarDTO),HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<RadarResponse> UpdateRadra(@RequestBody RadarRequest radarRequest,@PathVariable UUID id){
		RadarDTO radarDTO =radarService.UpdateRadar(id,radarMapper.fromRadarRequest(radarRequest));
		return new ResponseEntity<RadarResponse>(radarMapper.fromRadarDtoTOresponse(radarDTO),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> Delete(@PathVariable UUID id){
		radarService.DeleteRadar(id);
		return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
	}
	
}
