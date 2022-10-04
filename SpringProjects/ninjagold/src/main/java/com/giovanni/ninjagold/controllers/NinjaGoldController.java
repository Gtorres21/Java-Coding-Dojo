package com.giovanni.ninjagold.controllers;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	
	
	
	
	@GetMapping("/")
	public String ninjaGold() {
		return "index.jsp";
	}
	
	@PostMapping("/processGold")
	public String processGold(@RequestParam("name") String name,Model model, HttpSession session) {
		
		Integer gold = 0;
		model.addAttribute("gold",gold);
		session.setAttribute("name", name);
		
		
		
		
		if (gold<0) {
			//	Flash Redirect: Game over if 0'		
			return "redirect:/";
		}
		if (name=="farm"){
			int rand = ThreadLocalRandom.current().nextInt(10,20);
			gold += rand;
			
		}
		 if(name=="cave") {
			 int rand = ThreadLocalRandom.current().nextInt(5,10);
			 gold += rand;
			  
		 }
		 if(name=="house") {
			 int rand = ThreadLocalRandom.current().nextInt(2,5);
			 gold += rand;
			 
		 }
		 if(name=="quest") {
			 int rand = ThreadLocalRandom.current().nextInt(-50,50);
			 gold += rand;
				 
		 }
			 
		
		System.out.println(name);
		System.out.println(gold);
		return "redirect:/";
	}
	

}
