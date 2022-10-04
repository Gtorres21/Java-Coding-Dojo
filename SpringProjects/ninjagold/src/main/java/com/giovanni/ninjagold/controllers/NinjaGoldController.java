package com.giovanni.ninjagold.controllers;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	
	
	
	
	@GetMapping("/")
	public String ninjaGold(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0) ;
		}
		return "index.jsp";
	}
	
	@PostMapping("/processGold")
	public String processGold(@RequestParam("name") String name, HttpSession session) {
		
		
		Integer gold = (Integer) session.getAttribute("gold");
		session.setAttribute("name", name);		
		
		if (gold<0) {
			//	Flash Redirect: Game over if 0'		
			return "redirect:/";
		}
		if (name.equals("farm")){
			int rand = ThreadLocalRandom.current().nextInt(10,20);
			gold += rand;
			
		}
		 if(name.equals("cave")) {
			 int rand = ThreadLocalRandom.current().nextInt(5,10);
			 gold += rand;
			  
		 }
		 if(name.equals("house")) {
			 int rand = ThreadLocalRandom.current().nextInt(2,5);
			 gold += rand;
			 
		 }
		 if(name.equals("quest")) {
			 int rand = ThreadLocalRandom.current().nextInt(-50,50);
			 gold += rand;
					 
		 }
			 
		session.setAttribute("gold", gold);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String removeGold(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	
	
	
	


}
