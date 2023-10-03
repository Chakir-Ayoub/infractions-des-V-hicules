package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.VehiculeDto;
import com.example.demo.entity.Vehicule;
import com.example.demo.mapper.Vehiculemapper;
import com.example.demo.repository.VehiculeRepository;
import com.example.demo.service.vehiculeService;

@Service
public class vehiculeServiceImpl implements vehiculeService {
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	@Autowired
	Vehiculemapper vehiculemapper;
	@Override
	public List<VehiculeDto> GetAll() {
		// TODO Auto-generated method stub
		List<Vehicule> vehicules=vehiculeRepository.findAll();
		List<VehiculeDto> vehiculeDtos=new ArrayList<>();
		for (Vehicule vehicule : vehicules) {
			vehiculeDtos.add(vehiculemapper.fromEntity(vehicule));
		}
		
		return vehiculeDtos;
	}

	@Override
	public VehiculeDto AddVehicule(VehiculeDto vehiculeDto) {
		// TODO Auto-generated method stub
		Vehicule vehicule=vehiculemapper.fromDto(vehiculeDto);
		Vehicule vehicule2=vehiculeRepository.save(vehicule);
		
		return vehiculemapper.fromEntity(vehicule2);
	}

	@Override
	public VehiculeDto UpadteVehicule(VehiculeDto vehiculeDto, Long id) {
		// TODO Auto-generated method stub
		Vehicule vehicule=vehiculeRepository.findById(id).get();
		vehicule.setMarque(vehiculeDto.getMarque());
		vehicule.setMatricule(vehiculeDto.getMatricule());
		vehicule.setModels(vehiculeDto.getModels());
		vehicule.setPuissanceFiscale(vehiculeDto.getPuissanceFiscale());
		
		return vehiculemapper.fromEntity(vehicule);
	}

	@Override
	public VehiculeDto GetById(Long id) {
		// TODO Auto-generated method stub
		Vehicule vehicule=vehiculeRepository.findById(id).get();
		return vehiculemapper.fromEntity(vehicule);
	}

	@Override
	public void RemoveVehiculeDto(Long id) {
		// TODO Auto-generated method stub
		Vehicule vehicule=vehiculeRepository.findById(id).get();
		vehiculeRepository.delete(vehicule);
	}

}
