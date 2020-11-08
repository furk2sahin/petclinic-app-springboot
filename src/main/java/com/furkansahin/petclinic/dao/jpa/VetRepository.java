package com.furkansahin.petclinic.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furkansahin.petclinic.model.Vet;

public interface VetRepository extends JpaRepository<Vet, Long> {
	
}
