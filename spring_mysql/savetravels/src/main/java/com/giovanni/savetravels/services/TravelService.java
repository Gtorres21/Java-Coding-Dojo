package com.giovanni.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovanni.savetravels.models.Travel;
import com.giovanni.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
	
	private final TravelRepository travelRepository;
	
	public TravelService(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;	
	}
	
	public List<Travel> allTravels(){
		return travelRepository.findAll();
	}
	
	public Travel createTravel(Travel b) {
		return travelRepository.save(b);
	}

	
	public Travel findTravel(Long id) {
		Optional<Travel> optionalTravel = travelRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();
		}else {
			return null;
		}
	}
	
	public Travel editTravel(Travel travel) {
		return travelRepository.save(travel);
	}
	
	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);
	}

	
	
	
	
	
	
	
}
