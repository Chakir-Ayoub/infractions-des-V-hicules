package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.VehiculeDto;

public interface vehiculeService {
	List<VehiculeDto> GetAll();
	VehiculeDto AddVehicule(VehiculeDto vehiculeDto);
	VehiculeDto UpadteVehicule(VehiculeDto vehiculeDto,Long id);
	VehiculeDto GetById(Long id);
	void RemoveVehiculeDto(Long id);
}
