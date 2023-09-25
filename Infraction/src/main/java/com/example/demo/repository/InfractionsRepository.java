package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Infractions;

public interface InfractionsRepository extends JpaRepository<Infractions, Long> {

}
