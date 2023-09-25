package com.example.demo.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class InfractionsReqieust {
	private LocalDate dateInfraction;
	private Long Radar;
	private Long matricule;
	private Long vitessedeVehicule;
	private Long vitesseMaxRadar;
	private float montantInfraction;
}
