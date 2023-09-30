package com.example.demo.request;


import lombok.Data;

@Data
public class VehiculeRequest {
	private String matricule;
	private String marque;
	private Long models;
	private Long puissanceFiscale;
	private ProprieterRequest propriete;
}
