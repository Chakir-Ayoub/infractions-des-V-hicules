package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Radar;

public interface RadarReposirory extends JpaRepository<Radar, UUID> {
	Radar findByid(UUID id);
}
