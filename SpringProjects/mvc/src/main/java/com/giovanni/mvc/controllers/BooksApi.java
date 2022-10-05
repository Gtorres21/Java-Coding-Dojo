package com.giovanni.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giovanni.mvc.models.Book;
import com.giovanni.mvc.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;	
	}
	
	
	//Finds All Books
	@RequestMapping("/api/books")
	public List<Book> allBooks(){
		return bookService.allBooks();
	}
	
 
   @PostMapping("/api/books")
    public Book createBook(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
   //Finds One Book
    @RequestMapping("/api/books/{id}")
    public Book findOne(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    // Edit Book
    @PutMapping("/api/books/{id}")
    public Book editBook(@PathVariable("id") Long id, @RequestParam("title") String title, @RequestParam("description") String desc,@RequestParam("language") String lang, @RequestParam("pages") Integer numOfPages){
    	
    	Book bookEdited = bookService.findBook(id);
    	bookEdited.setTitle(title);
    	bookEdited.setDescription(desc);
    	bookEdited.setLanguage(lang);
    	bookEdited.setNumberOfPages(numOfPages);
    	
    	return bookService.editBook(bookEdited);
    }
    
    // Delete Book
    @DeleteMapping("/api/books/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
    	bookService.deleteBook(id);	
    }
    
    
    



	
	

}
