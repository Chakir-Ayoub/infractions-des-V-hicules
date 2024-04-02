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

import com.example.demo.dto.ProprieterDto;
import com.example.demo.mapper.Proprietemapper;
import com.example.demo.request.ProprieterRequest;
import com.example.demo.response.ProprieterResponse;
import com.example.demo.service.proprieteService;

@RestController
@RequestMapping("propriete")
public class ProprieteController {
	
	@Autowired
	private proprieteService proprieteService;
	@Autowired
	private Proprietemapper proprietemapper;
	
	@GetMapping
	public List<ProprieterResponse> GetAll(){
		
		List<ProprieterDto> proprieterDtos=proprieteService.GetAll();
		List<ProprieterResponse> proprieterResponses=new ArrayList<>();
		for (ProprieterDto proprieterDto : proprieterDtos) {
			proprieterResponses.add(proprietemapper.fromDtoResponse(proprieterDto));
		}
		return proprieterResponses;
	}
	
	@GetMapping("{id}")
	public ProprieterResponse GetById(@PathVariable long id) {
		
		ProprieterDto proprieterDto=proprieteService.GetById(id);
		return proprietemapper.fromDtoResponse(proprieterDto);
	}
	
	@PostMapping
	public ProprieterResponse AddPropriete(@RequestBody ProprieterRequest proprieterRequest) {
		ProprieterDto proprieterDto=proprietemapper.fromRequest(proprieterRequest);

		return proprietemapper.fromDtoResponse(proprieteService.AddPropriete(proprieterDto));
	}
	
	
	@PutMapping(path = "{id}")
	public ProprieterResponse UpdatePropriete(@RequestBody ProprieterRequest proprieterRequest,@PathVariable Long id) {
		ProprieterDto proprieterDto =proprietemapper.fromRequest(proprieterRequest);
		return proprietemapper.fromDtoResponse(proprieteService.updateproprieter(proprieterDto, id));
	}
	
	@DeleteMapping(path = "{id}")
	public void RemovePropriete(@PathVariable Long id) {
		 proprieteService.RemovePropriete(id);
	}
	
}
