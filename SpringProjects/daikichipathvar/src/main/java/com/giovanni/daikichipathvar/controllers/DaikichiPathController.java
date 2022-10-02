package com.giovanni.daikichipathvar.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiPathController {
	
	@RequestMapping("/daikichi/{pathOne}/{pathTwo}")
	public String index(@PathVariable("pathOne") String pathOne, @PathVariable("pathTwo") String pathTwo) {
		return "Congratulations! You will soon " + pathOne + " to " + pathTwo;
	}
	
	@RequestMapping("/daikichi/lotto/{num}")
	public String home(@PathVariable("num") Integer num) {
		if ((num%2)==0) {
			return "You will take grand journey in the near future, but be wary of tempting offers";
			
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			
		}
		
	}

}
