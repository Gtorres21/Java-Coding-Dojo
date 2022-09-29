package com.giovanni.zookeeperone.models;

public class Gorilla extends Mammal{	
	
//	constructor
	public Gorilla() {
		super();
	}
	
	public Gorilla(int energy) {
		super(energy);
	}
	
//	Method
	public int throwSomething() {
		this.energy = this.energy -5;
		System.out.printf("The Gorilla has thrown Something and lost 5 Energy has %d \n", this.energy);
		return this.energy;
	}
	
	public int eatBananas() {
		this.energy = this.energy + 10;
		System.out.printf("\n The Gorrilla is Satisfied and has a %d ", this.energy);
		return this.energy;
	}

	public int climb() {
		this.energy -= 10;
		System.out.printf("\n ook ook lost 10 energy now has %d", this.energy);
		return this.energy;
		}


	
	
}
