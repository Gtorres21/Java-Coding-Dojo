package com.giovanni.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.giovanni.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();
    // this method finds books with descriptions containing the search string
    List<Dojo> findByNameContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByNameContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByNameStartingWith(String search);

}
