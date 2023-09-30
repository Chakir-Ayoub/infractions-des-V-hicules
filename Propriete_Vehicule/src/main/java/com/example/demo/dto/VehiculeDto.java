package com.example.demo.dto;

import lombok.Data;

@Data
public class VehiculeDto {
	
	private String matricule;
	private String marque;
	private Long models;
	private Long puissanceFiscale;
	private ProprieterDto propriete;
}
