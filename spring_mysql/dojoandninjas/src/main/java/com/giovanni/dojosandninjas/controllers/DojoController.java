package com.giovanni.dojosandninjas.controllers;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.giovanni.dojosandninjas.models.Dojo;
import com.giovanni.dojosandninjas.models.Ninja;
import com.giovanni.dojosandninjas.services.DojoService;
import com.giovanni.dojosandninjas.services.NinjaService;

@Controller
//@RequestMapping("/")
public class DojoController {

	public final DojoService dojoService;
	public final NinjaService ninjaService;
	
	public DojoController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@GetMapping("/dashboard")
	public String allDojos(Model model) {
		model.addAttribute("allDojos", dojoService.allDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojo/new")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		return "newDojo.jsp";
		
	}
	
	@PostMapping("/dojo/create")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojo", dojoService.allDojos());
			return "index.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dojo/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneDojo", dojoService.findDojo(id));
		model.addAttribute("ninjas", ninjaService.findAll());
		return "showDojo.jsp";
	}
	
	@GetMapping("/ninja/new")
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("ninja", ninjaService.findAll());
			return "index.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/dashboard";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
