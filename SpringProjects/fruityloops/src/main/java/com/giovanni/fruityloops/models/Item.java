package com.giovanni.fruityloops.models;

public class Item {
	//	Member Variables
	private String name;
	private double price;
	
	//	constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}


    
    // As always, don't forget to generate Getters and Setters!
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

}
