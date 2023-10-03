package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Propriete;

public interface ProprieteRepository extends JpaRepository<Propriete, Long> {

}
