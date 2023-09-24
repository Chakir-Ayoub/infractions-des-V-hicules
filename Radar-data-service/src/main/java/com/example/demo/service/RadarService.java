package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import com.example.demo.dto.RadarDTO;

public interface RadarService {
	
	List<RadarDTO> GetAll();
	RadarDTO GetById(UUID id);
	RadarDTO AddRadar(RadarDTO radarDTO);
	RadarDTO UpdateRadar(UUID id,RadarDTO radarDTO);
	void DeleteRadar(UUID id);
	
}
