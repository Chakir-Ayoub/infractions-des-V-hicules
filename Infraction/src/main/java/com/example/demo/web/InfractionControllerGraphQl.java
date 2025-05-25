package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.serviceimpl.InfractionserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.request.InfractionsReqieust;
import com.example.demo.response.InfractionsResponse;
import com.example.demo.service.InfractionsService;

@RestController
public class InfractionControllerGraphQl {
	
	@Autowired
	private InfractionserviceImpl infractionsService;
	@Autowired
	private InfractionsMapper infractionsMapper;
	
	@QueryMapping
	public List<InfractionsResponse> GetAll(){
		List<InfractionsDTO> infractionsDTO =infractionsService.GetAll();
		List<InfractionsResponse> infractionsResponses=new ArrayList<>();
		
		for (InfractionsDTO infractionsDTO2 : infractionsDTO) {
			infractionsResponses.add(infractionsMapper.InfractionDtoToResponse(infractionsDTO2));
		}
		
		return infractionsResponses;
	}
	
	@QueryMapping
	public InfractionsResponse GetById(@Argument Long id) {
		InfractionsDTO infractions=infractionsService.GetById(id);
		return infractionsMapper.InfractionDtoToResponse(infractions);
	}
	
	@MutationMapping
	public InfractionsResponse SaveInfraction(@Argument InfractionsReqieust infractionsReqieust) {
		InfractionsDTO infractionsDTO2=infractionsService.SaveInfraction(infractionsMapper.frominfractionRequest(infractionsReqieust));
		return infractionsMapper.InfractionDtoToResponse(infractionsDTO2);
	}
	
	@MutationMapping
	public void Delete(@Argument Long id) {
		infractionsService.DeleteInfraction(id);
	}
}
