package com.demo.nov25;

import java.util.Arrays;

public class DemoOnGenrics {
	private static <T> void display(T data) {
		// TODO Auto-generated method stub
		System.out.println(data);

	}
	private static <T extends Number,U extends Number> void adddata(T data1,U data2) {
	;
		System.out.println(data1.intValue()+data2.intValue());


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Container<String> c= new Container<String>();
//		c.setItem("DemoTest");
//		System.out.println(c.getItem());
//		
//		Container<Student> c1 =new Container<Student>();
//		Student s = new Student();
//		c1.setItem(s);
//		System.out.println(c1.getItem());
//		
//		Container<Integer> c2 = new Container<Integer>();
//		c2.setItem(10);
//		System.out.println(c2.getItem());
//		
//		Container<Integer[]> c3 = new Container<Integer[]>();
//		Integer[]arr = {45,5,6,344,4,43555,3566,23};
//		c3.setItem(arr);
//		System.out.println(Arrays.toString(c3.getItem()));

//		Pair<String, Double> p = new Pair<String, Double>("Distance in km", 7.3);
//		System.out.println(p.toString());
//		Pair<String, Double> p1 = new Pair<String, Double>("Weight in kg", 73.3);
//		System.out.println(p1.toString());
//		Pair<Integer, String> p2 = new Pair<Integer, String>(500, "20 notes");
//		System.out.println(p2.toString());
//		Student s = new Student(1,"Saitama","C-Class");
//		Pair<Integer,Student> p3 = new Pair<Integer,Student>(2,s);
//		System.out.println(p3);
//		System.out.println(p3.getValue().toString());
//		create a order class which takes order of diff types of data (accepts genric class)
//		
//		Order<String> o0 = new Order<String>("Laptops");
//		Order<String> o1 = new Order<String>("Mobile");
//		Order<String> o2 = new Order<String>("Bench");
//		
//		System.out.println(o0);
//		System.out.println(o1);
//		System.out.println(o2);
//		
		Items item = new Items(1,"Laptop",50000);
//		Order<Items> o4 = new Order<Items>(item);
//		System.out.println(o4);
//
//		Items[] items = new Items[3];
//
//        items[0] = new Items(1, "Laptop", 75000.00);
//        items[1] = new Items(2, "Phone", 35000.00);
//        items[2] = new Items(3, "Headphones", 2500.00);
//        Order<Items[]> o5 = new Order<Items[]>(items);
//		System.out.println(Arrays.toString(o5.getItem()));

//		Integer[] nums = {1,4,2,5,3,6,4,7,798,0,9,8,89};
//		String[] str = {"Str1","Str2","Str3"};
//		
//		ArrayPrinter<String> s = new ArrayPrinter<>(str);
//		ArrayPrinter<Integer> n = new ArrayPrinter<>(nums);
//		System.out.println(s);
//		System.out.println(n);
		display("str");
		display(34);
		display(item);
		adddata(25.02, 445);
		

	}

}
