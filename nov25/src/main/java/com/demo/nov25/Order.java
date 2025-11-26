package com.demo.nov25;

import java.util.Arrays;

public class Order<T> {
	private T item;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	@Override
	public String toString() {
		if (item instanceof Object[]) {
            return "Order{" + "orderData=" + Arrays.toString((Object[]) item) + '}';
        }
		return "Order [item=" + item + "]";
	}

}
