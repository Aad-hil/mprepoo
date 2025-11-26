package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(5);
		tree.add(12);
		tree.add(23);
		tree.add(34);
		tree.add(45);
		tree.add(56);
		tree.add(67);
		tree.add(78);
		tree.add(89);
		tree.add(65);
		tree.add(10);
		tree.add(20);
		tree.add(30);
//		System.out.println(tree.ceiling(88));
//		System.out.println(tree.floor(7));
//		Iterator<Integer> itr = tree.descendingIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
		System.out.println(tree.higher(89));

		TreeSet<Student> students = new TreeSet<Student>();

		students.add(new Student(1, "Arjun", 20, "Chennai", 85.5));
		students.add(new Student(2, "Priya", 22, "Bangalore", 92.0));
		students.add(new Student(3, "Rahul", 19, "Delhi", 76.3));
		students.add(new Student(4, "Sneha", 21, "Mumbai", 88.7));
		students.add(new Student(5, "Karthik", 23, "Hyderabad", 67.4));
//        System.out.println();
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
