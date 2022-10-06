package com.giovanni.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.giovanni.savetravels.models.Travel;
import com.giovanni.savetravels.services.TravelService;

@Controller
@RequestMapping("/travels")
public class TravelController {
	public final TravelService travelService;

	public TravelController(TravelService travelService) {
		this.travelService = travelService;
	}
	
	// Can i have @Valid in my Get Route???? ----------------------------------
	
	@GetMapping("/new")
	public String allTravels(@ModelAttribute("travel") Travel travel,  Model model) {
		model.addAttribute("travels", travelService.allTravels());
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("travels", travelService.allTravels());
			return "index.jsp";
		}else {
			travelService.createTravel(travel);
			return "redirect:/travels/new";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String editTravel(@PathVariable("id") Long id, Model model ){
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
		
	}
	
	@PutMapping("/edit/{id}")
	public String processEdit(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if(result.hasErrors()){
			return "edit.jsp";
		}
		travelService.editTravel(travel);
		return "redirect:/travels/new";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/travels/new";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneTravel", travelService.findTravel(id));
		return "show.jsp";
		
		
	}
	
	
	
	
	
	
	
}
