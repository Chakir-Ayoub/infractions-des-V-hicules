package com.example.demo.response;

import com.example.demo.request.ProprieterRequest;

import lombok.Data;

@Data
public class VehiculeRespnse {
	private String matricule;
	private String marque;
	private Long models;
	private Long puissanceFiscale;
}
