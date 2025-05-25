package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.model.Radar;

public interface
InfractionsService {
	List<InfractionsDTO> GetAll();
	InfractionsDTO GetById(Long id);
	InfractionsDTO SaveInfraction(InfractionsDTO infractionsDTO);
	InfractionsDTO UpdateInfraction(InfractionsDTO infractionsDTO,Long id);
	void DeleteInfraction(Long id);
	List<Radar> GetAllRadar();

}
