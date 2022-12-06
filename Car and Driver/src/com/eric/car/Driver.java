package com.eric.car;

public class Driver extends Car {
// MEMBER VARIABLES OR ATTRIBUTES
//	Don't need anything here as the Driver class is inheriting
//	everything from the Car class(possible by the extends Car),
//	this includes MEMBER VARIABLES, CONSTRUCTORS,
//	GETTERS / SETTERS, AND OTHER METHODS

//METHODS
	public void drive() {
		setGas(getGas()-1);
		if (this.gas < 0) {
		System.out.println("GAME OVER!");
		}
		System.out.printf("Gas remaining: %d %n",getGas());
	}
	
	public void boosters() {
		setGas(getGas()-3);
//		bonus Add a 'game over' message to your car class that is 
//		displayed when the gas reaches zero.
		if (this.gas < 0) {
		System.out.println("GAME OVER!");
		}
		System.out.printf("Gas used: %d %n",getGas());
	}

	public void refuel() {
		setGas(getGas()+2);
		System.out.printf("Gas refueled: %d %n",getGas());
	}
}