package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Infractions implements Serializable {
	
	private static final long serialVersionUID = -6421608019813875133L;
	@Id
	@GeneratedValue
	private Long id;
	private LocalDate dateInfraction;
	private Long Radar;
	private Long matricule;
	private Long vitessedeVehicule;
	private Long vitesseMaxRadar;
	private float montantInfraction;
}
