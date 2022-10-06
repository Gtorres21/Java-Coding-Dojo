package com.giovanni.savetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.giovanni.savetravels.models.Travel;
import com.giovanni.savetravels.services.TravelService;

public class TravelApi {
	private final TravelService travelService;

	public TravelApi(TravelService travelService) {
		this.travelService = travelService;
	}
	
	// Finds All Books
	@RequestMapping("/api/travel")
	public List<Travel> allTravels(){
		return travelService.allTravels();
	}
	
	@PostMapping("/api/travel")
    public Travel createBook(@RequestParam(value="expense") String expense, @RequestParam(value="vendor") String vendor, @RequestParam(value="amount") Double amount, @RequestParam(value="description") String description) {
        Travel travel = new Travel(expense,vendor,amount,description);
        return travelService.createTravel(travel);
    }
	
	
	// Finds One Book
	@RequestMapping("/api/travel/{id}")
    public Travel findOne(@PathVariable("id") Long id) {
        Travel travel = travelService.findTravel(id);
        return travel;
    }
  
	// Edit Book
	@PutMapping("/api/travel/{id}")
    public Travel editTravel(@PathVariable("id") Long id, @RequestParam("expense") String expense, @RequestParam("vendor") String vendor,@RequestParam("amount") Double amount, @RequestParam("description") String description){
        
        Travel travelEdited = travelService.findTravel(id);
        travelEdited.setExpense(expense);
        travelEdited.setVendor(vendor);
        travelEdited.setAmount(amount);
        travelEdited.setDescription(description);
   
        return travelService.editTravel(travelEdited);
    }
  
	
	//Delete Book
	@DeleteMapping("/api/travel/{id}")
	public void deleteTravel(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
	}
	
	

}
