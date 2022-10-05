package com.giovanni.mvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.giovanni.mvc.services.BookService;


@Controller
@RequestMapping("/")
public class BooksController {
	
	public final BookService bookService;
	public BooksController(BookService bookService) {	
		this.bookService = bookService;
	}
	
	@GetMapping("/all")
	public String allBooks(Model model) {
		model.addAttribute("allBooks", bookService.allBooks());
		return "book/showall.jsp";
		
	}
	
	@GetMapping("/books/{id}")
	public String displayBook(@PathVariable("id")Long id, Model model) {
		model.addAttribute("book", bookService.findBook(id));
		return "book/show.jsp";
		
	}
	

}
