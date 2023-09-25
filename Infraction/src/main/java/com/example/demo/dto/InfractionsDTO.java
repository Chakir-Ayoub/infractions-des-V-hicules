package com.example.demo.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class InfractionsDTO {
	private LocalDate dateInfraction;
	private Long Radar;
	private Long matricule;
	private Long vitessedeVehicule;
	private Long vitesseMaxRadar;
	private float montantInfraction;
}
