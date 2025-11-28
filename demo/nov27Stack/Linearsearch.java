package com.demo.nov27Stack;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 45, 12, 65, 87, 44, 9, 98 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
//		int i = 0;
//		int key = sc.nextInt();
//		for (i=0; i <arr.length; i++) {
//			if(arr[i] == key) {
//				System.out.println("Element found at " + i);
//				break;
//			}
//		}
//		if (i == arr.length) {
//			System.out.println("Element not found");
//		}
//		int []arr1 = {1,2,3,4,5,6};
//		int right = arr1.length;
//		int left = 0;
//		while(left<=right) {
//			int mid = (int)(left+right)/2;
//			if(arr1[mid]==key) {
//				System.out.println("Element found at "+mid);
//				break;
//			}else if(arr1[mid]>key) {
//				right = mid-1;
//			}else {
//				left = mid+1;
//			}
//			if(left>=right) {
//				System.out.println("Element not found");
//			}
//		}

//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			int min_index = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[min_index]) {
//
//					min_index = j;
//				}
//			}
//			if (min_index != i) {
//				temp = arr[i];
//				arr[i] = arr[min_index];
//				arr[min_index] = temp;
//			}
//
//		}
		

		for (int i = 1; i < arr.length - 1; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			for (int ii : arr) {
				System.out.print(ii+" ");
			}System.out.println();
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
