package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
