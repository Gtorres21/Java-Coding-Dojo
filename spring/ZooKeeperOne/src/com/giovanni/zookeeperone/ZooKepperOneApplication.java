package com.giovanni.zookeeperone;
import com.giovanni.zookeeperone.models.Gorilla;
import com.giovanni.zookeeperone.models.Mammal;

public class ZooKepperOneApplication {

	public static void main(String[] args) {
		
//		Mammal animal1 = new Mammal(100);
//		animal1.displayEnergy();
//		
//		Mammal animal2 = new Mammal();
//		animal2.displayEnergy();
		
		Gorilla monkey1 = new Gorilla();
		monkey1.setEnergy(100);
		monkey1.throwSomething();
		monkey1.throwSomething();
		monkey1.throwSomething();
		monkey1.eatBananas();
		monkey1.eatBananas();
		monkey1.climb();
//		100 - (15) + (20) - 10 = 95;
		monkey1.getEnergy();
	

		
		
	}

}
