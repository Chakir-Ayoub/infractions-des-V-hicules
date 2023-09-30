package com.example.demo.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class ProprieterDto {
	
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	private List<VehiculeDto> vehicules;
}
