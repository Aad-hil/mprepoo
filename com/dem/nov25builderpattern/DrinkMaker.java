package com.dem.nov25builderpattern;

public abstract class DrinkMaker {

	public final void prepareDrink() {
		boilWater();
		serveWater();

		makeDrink();
		addExtra();

	}

	public void boilWater() {
		System.out.println("Water Boiled");
	}

	abstract void makeDrink();

	abstract void addExtra();

	public void serveWater() {
		System.out.println("Drinks Served");
	}

}
