package com.furkansahin.petclinic.service;

import java.util.List;

import javax.validation.Valid;

import com.furkansahin.petclinic.exception.OwnerNotFoundException;
import com.furkansahin.petclinic.exception.VetNotFoundException;
import com.furkansahin.petclinic.model.Owner;
import com.furkansahin.petclinic.model.Vet;

public interface PetClinicService {
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void createOwner(@Valid Owner owner);
	void updateOwner(Owner owner);
	void deleteOwner(Long id);
	List<Vet> findVets();
	Vet findVet(Long id) throws VetNotFoundException;
}
