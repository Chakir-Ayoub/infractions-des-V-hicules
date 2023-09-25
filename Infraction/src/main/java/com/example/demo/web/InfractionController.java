package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.request.InfractionsReqieust;
import com.example.demo.response.InfractionsResponse;
import com.example.demo.service.InfractionsService;

@RestController
@RequestMapping("infraction")
public class InfractionController {
	
	@Autowired
	private InfractionsService infractionsService;
	@Autowired
	private InfractionsMapper infractionsMapper=new InfractionsMapper();
	
	@GetMapping
	public List<InfractionsResponse> GetAll(){
		List<InfractionsDTO> infractionsDTO =infractionsService.GetAll();
		List<InfractionsResponse> infractionsResponses=new ArrayList<>();
		
		for (InfractionsDTO infractionsDTO2 : infractionsDTO) {
			infractionsResponses.add(infractionsMapper.InfractionDtoToResponse(infractionsDTO2));
		}
		
		return infractionsResponses;
	}
	
	@GetMapping(path = "{id}")
	public InfractionsResponse GetById(@PathVariable Long id) {
		InfractionsDTO infractions=infractionsService.GetById(id);
		return infractionsMapper.InfractionDtoToResponse(infractions);
	}
	
	@PostMapping
	public InfractionsResponse SaveInfraction(@RequestBody InfractionsReqieust infractionsReqieust) {
		InfractionsDTO infractionsDTO2=infractionsService.SaveInfraction(infractionsMapper.frominfractionRequest(infractionsReqieust));
		return infractionsMapper.InfractionDtoToResponse(infractionsDTO2);
	}
	
	@DeleteMapping(path = "{id}")
	public void Delete(@PathVariable Long id) {
		infractionsService.DeleteInfraction(id);
	}
}
