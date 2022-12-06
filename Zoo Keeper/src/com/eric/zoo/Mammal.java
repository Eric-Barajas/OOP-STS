package com.eric.zoo;

public class Mammal {
// MEMBER VARIABLES
//	Create a Mammal class that has an energyLevel member variable and displayEnergy() method. 
	protected int energyLevel;
	
	
// CONSTRUCTORS
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
// GETTERS / SETTERS / OTHER METHODS
// The displayEnergy() method should show the animal's energy level as well as return it.
	public int displayEnergy() {
		System.out.printf("energy level: %d %n", energyLevel);
		return energyLevel;
	}


	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	



}
