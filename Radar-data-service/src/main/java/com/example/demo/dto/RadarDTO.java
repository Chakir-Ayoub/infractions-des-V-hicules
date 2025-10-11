package com.example.demo.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class RadarDTO {
	private UUID id;
	private Integer maxVitesse;
	private Float latitude;
	private Float langitude;
}
