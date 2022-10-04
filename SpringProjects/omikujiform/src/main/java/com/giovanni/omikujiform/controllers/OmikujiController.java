package com.giovanni.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	
//	Create getMapping
	@GetMapping("/")
	public String reviewForm() {
		return "omikujiForm/omikuji.jsp";
	}
	
	@PostMapping("/processForm")
	public String processForm(@RequestParam("num") Integer num ,@RequestParam("city") String city, @RequestParam("name") String name, @RequestParam("hobby") String hobby, @RequestParam("thing") String thing, @RequestParam("comment") String comment, HttpSession session) {
		//Create Sessions	
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("comment", comment);
		
		//redirect to display
		return "redirect:/processForm/data";
		
	}
	
	//	Create Display Mapping
	@GetMapping("/processForm/data")
	public String displayForm() {
		return "omikujiForm/displayOmikuji.jsp";
	}
	
}
