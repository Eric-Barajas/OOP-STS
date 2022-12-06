package com.eric.zoo;

public class Gorilla extends Mammal{
// MEMBER VARIABLES

// Constructors
	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
	public void throwSomething() {
		System.out.println("The Gorilla threw a barrel");
		setEnergyLevel(getEnergyLevel()-5);
	}
	public void eatBananas() {
		System.out.println("The Gorilla is Happy");
		setEnergyLevel(getEnergyLevel()+10);
	}
	public void climb() {
		System.out.println("The Gorilla has climbed a tree");
		setEnergyLevel(getEnergyLevel()-10);
	}

}
