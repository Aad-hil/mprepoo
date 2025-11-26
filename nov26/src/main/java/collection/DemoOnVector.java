package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<Integer>();
	System.out.println(vector.capacity());
	for(int i =0;i<=99;i++) {
		vector.add(i);
	}
	System.out.println(vector.capacity());
	
	Enumeration<Integer> enums = vector.elements();	
	while(enums.hasMoreElements())
		System.out.println(enums.nextElement());
	
	
	Iterator<Integer> itr = vector.iterator();
	while(itr.hasNext()) {
		int num= itr.next();
		if(num%3==0) {
			itr.remove();
		}
		System.out.println(num);
	}
	System.out.println(vector);
	
}
}
