package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.VehiculeDto;
import com.example.demo.mapper.Vehiculemapper;
import com.example.demo.response.VehiculeRespnse;
import com.example.demo.service.vehiculeService;

@RestController
@RequestMapping("vehicule")
public class vehiculeController {
	
	@Autowired
	vehiculeService vehiculeService;
	@Autowired
	Vehiculemapper vehiculemapper;
	
	@GetMapping
	public List<VehiculeRespnse> GetAll(){
		List<VehiculeDto> vehiculeDtos=vehiculeService.GetAll();
		List<VehiculeRespnse> vehiculeRespnses=new ArrayList<>();
		
		for (VehiculeDto vehiculeDto : vehiculeDtos) {
			vehiculeRespnses.add(vehiculemapper.fromDTOResponse(vehiculeDto));
		}
		return vehiculeRespnses;
	}
	
	@GetMapping(path = "{id}")
	public VehiculeRespnse GetById(@PathVariable Long id) {
		VehiculeDto vehiculeDto=vehiculeService.GetById(id);
		return vehiculemapper.fromDTOResponse(vehiculeDto);
	}
	
	@PostMapping
	public VehiculeRespnse AddVehicule(@RequestBody VehiculeDto vehiculeDto) {
		VehiculeDto vehiculeDto2=vehiculeService.AddVehicule(vehiculeDto);
		return vehiculemapper.fromDTOResponse(vehiculeDto2);
	}
	
	@PutMapping(path = "{id}")
	public VehiculeRespnse UpdateVehicule(@RequestBody VehiculeDto vehiculeDto,@PathVariable Long id) {
		VehiculeDto vehiculeDto2=vehiculeService.UpadteVehicule(vehiculeDto,id);
		return vehiculemapper.fromDTOResponse(vehiculeDto2);
	}
	
	@DeleteMapping(path = "{id}")
	public void RemoveVehicule(@PathVariable Long id) {
		vehiculeService.RemoveVehiculeDto(id);
	}
}
