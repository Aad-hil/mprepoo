package com.demo.nov27Stack;

import java.util.Scanner;

public class Mycircluarqueue {

	private static int[] arr;
	private static int front, rear, size, capacity;

	public Mycircluarqueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	public static boolean isEmpty() {
		return size == 0;
	}

	public static boolean isFull() {
		return size == capacity;
	}

	public static void insert() {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			System.out.print("Enter an element: ");
			Scanner sc = new Scanner(System.in);
			int element = sc.nextInt();

			if (front == -1) {
				front = 0;
				rear = 0;
				arr[rear] = element;
			} else {
				rear = (rear + 1) % capacity;
				arr[rear] = element;
			}

			size++;
			System.out.println(element + " inserted successfully");
		}
	}

	public static void delete() {
		if (isEmpty()) {
			System.out.println("The Queue is already empty...");
		} else {
			int element = arr[front];
			front = (front + 1) % capacity;
			size--;

			if (size == 0) { // reset when empty
				front = -1;
				rear = -1;
			}

			System.out.println("Deleted element: " + element);
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("The Queue is already empty...");
		} else {
			System.out.print("Queue elements: ");
			int i = front;
			for (int count = 0; count < size; count++) {
				System.out.print(arr[i] + " ");
				i = (i + 1) % capacity;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter capacity of queue: ");
		capacity = sc.nextInt();
		new Mycircluarqueue(capacity);
		Mycircluarqueue.display();
		Mycircluarqueue.insert();
		Mycircluarqueue.insert();
		Mycircluarqueue.insert();
		Mycircluarqueue.display();
		Mycircluarqueue.delete();
		Mycircluarqueue.display();


	}
}
