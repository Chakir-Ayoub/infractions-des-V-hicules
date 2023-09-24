package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RadarDTO;
import com.example.demo.entity.Radar;
import com.example.demo.mapper.RadarMapper;
import com.example.demo.repository.RadarReposirory;
import com.example.demo.service.RadarService;

@Service
public class RadarImpl implements RadarService {
	@Autowired
	RadarReposirory radarReposirory;
	@Autowired
	RadarMapper radarMapper;
	@Override
	public List<RadarDTO> GetAll() {
		// TODO Auto-generated method stub
		List<Radar> radars=radarReposirory.findAll();
		List<RadarDTO> radarDTOs =new ArrayList<>();
		for (Radar radar : radars) {
		radarDTOs.add(radarMapper.fromRadar(radar));
		}
		return radarDTOs;
	}

	@Override
	public RadarDTO GetById(UUID id) {
		// TODO Auto-generated method stub
		Radar radar=radarReposirory.findByid(id);
		if(radar==null) throw new RuntimeException("Not fund");
		return radarMapper.fromRadar(radar);
	}

	@Override
	public RadarDTO AddRadar(RadarDTO radarDTO) {
		// TODO Auto-generated method stub
		Radar radar =radarMapper.fromRadarDto(radarDTO);
		radarReposirory.save(radar);
		return radarMapper.fromRadar(radar);
	}

	@Override
	public RadarDTO UpdateRadar(UUID id, RadarDTO radarDTO) {
		// TODO Auto-generated method stub
		Radar radar = radarReposirory.findByid(id);
		
		radar.setMaxVitesse(radarDTO.getMaxVitesse());
		radar.setLangitude(radarDTO.getLangitude());
		radar.setLatitude(radarDTO.getLatitude());
		
		radarReposirory.save(radar);
		return radarMapper.fromRadar(radar);
	}

	@Override
	public void DeleteRadar(UUID id) {
		// TODO Auto-generated method stub
		Radar radar = radarReposirory.findByid(id);
		radarReposirory.delete(radar);
	}
	
	
}
