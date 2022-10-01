package com.giovanni.hellohuman.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloHumanController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Hello Human";
	}
	
	@RequestMapping("/name")
	public String index (@RequestParam(value="q") String searchQuery){
		return "Hello " + searchQuery;
	}
	
	@RequestMapping("/fullname")
	public String index (@RequestParam(value="name") String name, @RequestParam(value="lastName", required=false) String lastName, @RequestParam(value="num", required=false)Integer num){
		if (lastName != null) {
			return "Hello my name is " + name + " " + lastName;
			
		}else if(num>0){
			String response = "Hello my name is " + name;

			return response.repeat(num);
			
		}
		
		return "Hello my name is " + name;
	}
	


}
