package com.example.response;

import lombok.Data;

import java.util.UUID;

@Data
public class RadarResponse {
	private UUID id;
	private Integer maxVitesse;
	private Float latitude;
	private Float langitude;
}
