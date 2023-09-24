package com.example.demo.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.web.RadarControllerSoap;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class CxfConfig {
	private Bus bus;
	private RadarControllerSoap radarControllerSoap;
	
	@Bean
	public EndpointImpl endpoint() {
		EndpointImpl endpoint=new EndpointImpl(bus, radarControllerSoap);
		endpoint.publish("/radarservice");
		return endpoint;
	}
	
}
