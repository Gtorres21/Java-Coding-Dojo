package com.giovanni.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.giovanni.savetravels.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long>{
	
	List<Travel> findAll();
	
	List<Travel> findByExpenseContaining(String search);
	
	Long countByExpenseContaining(String search);
	
	Long deleteByExpenseStartingWith(String search);
	

}
