package com.eric.zoo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla actions = new Gorilla();
		actions.throwSomething();
		actions.throwSomething();
		actions.throwSomething();
		actions.eatBananas();
		actions.eatBananas();
		actions.climb();
		actions.displayEnergy();
	
		Bat action = new Bat();
		action.attackTown();
		action.attackTown();
		action.attackTown();
		action.eatHumans();
		action.eatHumans();
		action.fly();
		action.fly();
		action.displayEnergy();
	}

}
