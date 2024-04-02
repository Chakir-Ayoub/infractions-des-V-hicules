package com.example.demo.request;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.dto.VehiculeDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProprieterRequest {
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	private List<VehiculeRequest> vehicules;
}
