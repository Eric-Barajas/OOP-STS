package com.eric.car;

public class Car {
// attribute
	protected int gas;

	public Car() {
		this.gas = 10;

	}
	
// METHODS
	public void displayGas() {
		System.out.println(getGas());
	}

// GETTERS / SETTERS
		public int getGas() {
			return gas;
		}

		public void setGas(int gas) {
			this.gas = gas;
		}

}
