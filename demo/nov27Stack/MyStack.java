package com.demo.nov27Stack;

import java.util.Scanner;

public class MyStack {
	private static Node top = null;

	public static boolean isEmpty() {
		return top == null;
	}

	public static Node createNode() {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		return new Node(data);

	}

	public static void push() {
		Node newNode = createNode();
		if (top == null)
			top = newNode;
		else {
			newNode.setNext(top);
			top = newNode;

		}
		System.out.println("Inserted " + newNode.getData());

	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
		} else {
			System.out.println(top.getData() + "  is popped");
			Node temp = top;
			top = top.getNext();
			temp.setNext(null);
			
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("No stack Exist");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.getData()+ "-->");
				temp = temp.getNext();
			}
			System.out.println("null");
		}

	}

}
