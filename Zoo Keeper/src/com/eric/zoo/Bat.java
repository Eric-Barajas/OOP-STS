package com.eric.zoo;

public class Bat extends Mammal{
	// MEMBER VARIABLES

	// Constructors
		public Bat() {
			super();
			this.energyLevel = 300;
			// TODO Auto-generated constructor stub
		}
//		Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
		public void fly() {
			System.out.println("sound of a bat taking up");
			setEnergyLevel(getEnergyLevel()-50);
		}
		public void eatHumans() {
			System.out.println(" so- well, never mind,");
			setEnergyLevel(getEnergyLevel()+25);
		}
		public void attackTown() {
			System.out.println("sound of a town on fire");
			setEnergyLevel(getEnergyLevel()-100);
		}

}
