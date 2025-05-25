package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.serviceimpl.InfractionserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.dto.InfractionsDTO;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.request.InfractionsReqieust;
import com.example.demo.response.InfractionsResponse;
import com.example.demo.service.InfractionsService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@Component
@WebService(serviceName = "RadarWS")
public class InfractionControllerSoap {
	
	@Autowired
	InfractionserviceImpl infractionsService;
	@Autowired
	InfractionsMapper infractionsMapper;
	
	@WebMethod
	public List<InfractionsResponse> GetAll(){
		List<InfractionsDTO> infractionsDTO =infractionsService.GetAll();
		List<InfractionsResponse> infractionsResponses=new ArrayList<>();
		
		for (InfractionsDTO infractionsDTO2 : infractionsDTO) {
			infractionsResponses.add(infractionsMapper.InfractionDtoToResponse(infractionsDTO2));
		}
		
		return infractionsResponses;
	}
	@WebMethod
	public InfractionsResponse GetById(@WebParam(name="id") Long id) {
		InfractionsDTO infractions=infractionsService.GetById(id);
		return infractionsMapper.InfractionDtoToResponse(infractions);
	}
	
	@WebMethod
	public InfractionsResponse SaveInfraction(@WebParam(name = "infraction") InfractionsReqieust infractionsReqieust) {
		InfractionsDTO infractionsDTO2=infractionsService.SaveInfraction(infractionsMapper.frominfractionRequest(infractionsReqieust));
		return infractionsMapper.InfractionDtoToResponse(infractionsDTO2);
	}
	@WebMethod
	public void Delete(@WebParam(name = "id") Long id) {
		infractionsService.DeleteInfraction(id);
	}
}
