package com.giovanni.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovanni.dojosandninjas.models.Ninja;
import com.giovanni.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	public final NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	// Find All 
	public List<Ninja> findAll(){
		return ninjaRepo.findAll();
	}
	
	// get one by id
	public Ninja getNinja(Long id) {
		Optional<Ninja> potentialNinja = ninjaRepo.findById(id);
		return potentialNinja.isPresent() ? potentialNinja.get() : null;
		
	}
	
	// Create
	public Ninja createNinja(Ninja b) {
		return ninjaRepo.save(b);
	}
	
	// Find by Dojo ID
	public Ninja findByDojoId(Long id) {
		Optional<Ninja> manyNinjas = ninjaRepo.findByDojoId(id);
		return manyNinjas.isPresent() ? manyNinjas.get() : null;
		
	}

}
