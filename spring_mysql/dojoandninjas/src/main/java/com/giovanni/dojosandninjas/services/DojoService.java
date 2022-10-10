package com.giovanni.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovanni.dojosandninjas.models.Dojo;
import com.giovanni.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	public final DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	// Create Dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepo.save(b);
	}
	
	// Show All Dojos
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	//Find by id
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	

}
