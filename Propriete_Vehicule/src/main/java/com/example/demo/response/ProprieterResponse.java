package com.example.demo.response;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class ProprieterResponse {
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	private List<VehiculeRespnse> vehicules;
}
