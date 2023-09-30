package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Propriete implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 288055620014938074L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "propriete")
	private List<Vehicule> vehicules;
}
