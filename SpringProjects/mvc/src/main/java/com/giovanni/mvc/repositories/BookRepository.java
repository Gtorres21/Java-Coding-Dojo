package com.giovanni.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giovanni.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	//This method retrieves all the books from the database
	List<Book> findAll();
	//This method finds books with descriptions containing the search string
	List<Book> findByDescriptionContaining(String search);
	//This method counts how many titles contain a certain string
	Long countByTitleContaining(String search);
	//This Method deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);
	

}
