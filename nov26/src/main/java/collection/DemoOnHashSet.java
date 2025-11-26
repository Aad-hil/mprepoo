package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(5);
		hashset.add(12);
		hashset.add(23);
		hashset.add(34);
		hashset.add(45);
		hashset.add(56);
		hashset.add(67);
		hashset.add(78);
		hashset.add(89);
		hashset.add(65);
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);

//		System.out.println(hashset);
//
//		for (Integer i : hashset) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		Iterator itr = hashset.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		hashset.forEach(System.out::print);
		
		
		LinkedHashSet<Integer> llhashset = new LinkedHashSet<Integer>();
		llhashset.add(5);
		llhashset.add(12);
		llhashset.add(23);
		llhashset.add(34);
		llhashset.add(45);
		llhashset.add(56);
		llhashset.add(67);
		llhashset.add(78);
		llhashset.add(89);
		llhashset.add(65);
		llhashset.add(10);
		llhashset.add(20);
		llhashset.add(30);
		System.out.println(llhashset);
		

	}

}
