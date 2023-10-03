package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ProprieterDto;

public interface proprieteService {
	List<ProprieterDto> GetAll();
	ProprieterDto AddPropriete(ProprieterDto proprieterDto);
	ProprieterDto GetById(Long id);
	ProprieterDto updateproprieter(ProprieterDto proprieterDto,Long id);
	void RemovePropriete(Long id);
}
