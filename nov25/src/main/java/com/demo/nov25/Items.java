package com.demo.nov25;

public class Items {
	private int id;
	private String itemName;

	public int getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public Items(int id, String itemName, double itemCost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double itemCost;

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}

}
