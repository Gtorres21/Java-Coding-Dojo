package com.giovanni.dojosandninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giovanni.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	
	List<Ninja> findAll();	
	Optional<Ninja> findByDojoId(Long Id);
	
	

}
