package com.giovanni.zookeepertwo.models;

public class Bat extends Mammal{
	

	
//	Constructor
	public Bat() {
		this.energy = 300;
		
	}
	
	public Bat(int energy) {
		super(energy);
	}
	
	
	
//	Method
	public void fly() {
		this.energy -=49;
		System.out.print("\n flap flap flap flap only has ");
	}
	
	public void eatHumans() {
		this.energy += 25;
		System.out.print("\n so- well, never mind ");
	}
	
	public void attackTown() {
		this.energy -= 100;
		System.out.print("\n AHHHHH AHHHHHH AHHHH FIREE!!!!");
	}
	
	
	
	
	
	
	
	
	
	

}
