package com.giovanni.zookeepertwo.models;

public class Mammal {
	
//	attributes
	protected int energy;

	
//	Constructor
	public Mammal() {}
	
	public Mammal(int energy) {
		this.energy = energy;	
	}
	
//	Methods
	public int displayEnergy() {
		System.out.printf("Energy Level: %d", this.energy);
		return this.energy;
	}
	

	


//	Getters and Setters
	public int getEnergy() {
		System.out.printf("\n Energy Level: %d", this.energy);
		return this.energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}	
	
	
	
	

}
