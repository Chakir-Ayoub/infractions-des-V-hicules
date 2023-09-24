package com.example.demo.entity;

import java.io.Serializable;
import java.util.UUID;


import jakarta.annotation.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Radar implements Serializable {

	private static final long serialVersionUID = -5000752966472386080L;
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	private Integer maxVitesse;
	private Float latitude;
	private Float langitude;
}
