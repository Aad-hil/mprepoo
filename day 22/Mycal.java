package com.demo.Day22;

public class Mycal {

	public static void main(String[] args) {
//		Calculator c = (int a, int b) -> a+b;
//		System.out.println(c.add(10, 130));
//		Calculator c = (int a, int b)-> System.out.println(a-b);
//		c.sub(2333,10000);
		
//		Calculator c = ()-> {
//			int a = 89 ,b=4;
//			System.out.println(a*b);
//		};
//		c.mul();
//		
		
		Calculator c = ()-> {
			int a = 2,b=5;
			return (float)a/b;
		};
		System.out.println(c.div());
	}

}
