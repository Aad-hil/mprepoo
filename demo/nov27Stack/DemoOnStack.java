package com.demo.nov27Stack;

public class DemoOnStack {
	private static int[] nums = new int[10];
	private static int top = -1;

	public static boolean isEmpty() {

		return top == -1;

	}

	public static boolean isFull() {

		return top == nums.length;

	}

	public static void push(int element) {
		if (isFull()) {
			System.out.println("Stack Overflow");

		} else {
			nums[++top] = element;

		}
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("StackUnderflow");
		} else {
			System.out.println(nums[top--]);
		}
	}

	public static void display() {
		for (int i : nums)
			System.out.println(i);
	}

	public static void peek() {
		System.out.println(nums[top]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(10);
		display();
		peek();
		pop();
		display();

	}

}
