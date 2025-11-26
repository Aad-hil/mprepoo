package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<Integer>();
		l.add(5);
        l.add(12);
        l.add(23);
        l.add(34);
        l.add(45);
        l.add(56);
        l.add(67);
        l.add(78);
        l.add(89);
        l.add(65);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(1, 15);       // insert at index 1
        l.addFirst(5);      // add at beginning
        l.addLast(40);      // add at end
        System.out.println(l); // [5, 10, 15, 20, 30, 40]

		Iterator<Integer>itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
