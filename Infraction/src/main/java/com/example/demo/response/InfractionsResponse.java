package com.example.demo.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class InfractionsResponse {
	private LocalDate dateInfraction;
	private Long Radar;
	private Long matricule;
	private Long vitessedeVehicule;
	private Long vitesseMaxRadar;
	private float montantInfraction;
}
