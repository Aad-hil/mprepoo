package com.demo.nov25;

import java.util.Arrays;

public class ArrayPrinter<T> {
	private T[] arr;

	public ArrayPrinter(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	@Override
	public String toString() {
		return "ArrayPrinter [arr=" + Arrays.toString(arr) + "]";
	}

}
