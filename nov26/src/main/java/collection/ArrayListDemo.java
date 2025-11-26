package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList a = new ArrayList();
//		a.add(56);
//		a.add("Syrrr");
//		a.add(true);
//		Person p = new Person("demo", 132);
//		a.add(p);
//		a.add(p);
//		a.add(p);
//		a.add(p);
//		a.add(null);
//
//		System.out.println(a);
//		System.out.println(a.get(2));
//
//		ArrayList<String> namesList = new ArrayList<String>();
//		namesList.add("Arjun");
//		namesList.add("Priya");
//		namesList.add("Rahul");
//		namesList.add("Ananya");
//		namesList.add("Sneha");
//		namesList.add("Meera");
//		namesList.add("Karthik");
//		namesList.add("Divya");
//
//		System.out.println("Sysout\n");
//		System.out.println(namesList);
//		System.out.println("enhanced loop\n");
//		for (String names : namesList)
//			System.out.println(names);
//		System.out.println("Using iterators\n");
//		Iterator<String> itr = namesList.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
//
//		System.out.println("Using Listiterators\n");
//		ListIterator<String> Listitr = namesList.listIterator();
//		while (Listitr.hasNext())
//			System.out.println(Listitr.next());
//		System.out.println("\nUsing ListIterator (backward):");
//		while (Listitr.hasPrevious()) {
//			System.out.println(Listitr.previous());
//		}
//		System.out.println(namesList.contains("Meera"));
//
//		System.out.println("ForEach");
//		namesList.forEach(name -> System.out.println(name));
//		namesList.forEach(System.out::println);
//		System.out.println(namesList.remove(0));
//		System.out.println(namesList);
//
//		Integer arr[] = { 2, 3, 45, 6, 67, 8, 8, 9, 9 };
//		Integer brr[] = { 0, 1, 2, 3 };
//
//		List<Integer> numsLista = new ArrayList<>(Arrays.asList(arr));
//		List<Integer> numsListb = new ArrayList<>(Arrays.asList(brr));
//		System.out.println(numsLista);
//		numsLista.retainAll(numsListb);
//		Collections.sort(namesList);
//		System.out.println(namesList);
//		
//		ArrayList<String> CloneList = (ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(CloneList.hashCode());
//		CloneList.add("DEmo");
//		CloneList.add("DEo");
//		
//		System.out.println(CloneList.hashCode());

		ArrayList<Student> s = new ArrayList<Student>();
		 s.add(new Student(1, "Arjun", 20, "Chennai", 85.5));
	        s.add(new Student(2, "Priya", 22, "Bangalore", 92.0));
	        s.add(new Student(3, "Rahul", 19, "Delhi", 76.3));
	        s.add(new Student(4, "Sneha", 21, "Mumbai", 88.7));
	        s.add(new Student(5, "Karthik", 23, "Hyderabad", 67.4));
	        s.add(new Student(6, "Divya", 20, "Pune", 95.2));
	        s.add(new Student(7, "Meera", 24, "Kolkata", 72.5));
	        s.add(new Student(8, "Vikram", 22, "Chennai", 81.0));
	        s.add(new Student(9, "Ananya", 21, "Delhi", 90.3));
	        s.add(new Student(10, "Ravi", 23, "Bangalore", 69.8));

	        s.add(new Student(11, "Suresh", 22, "Chennai", 78.4));
	        s.add(new Student(12, "Lakshmi", 20, "Hyderabad", 84.6));
	        s.add(new Student(13, "Sneha", 25, "Delhi", 73.9));
	        s.add(new Student(14, "Geeta", 21, "Mumbai", 91.5));
	        s.add(new Student(15, "Naveen", 23, "Pune", 65.2));
	        s.add(new Student(16, "Aishwarya", 22, "Kolkata", 87.1));
	        s.add(new Student(17, "Santosh", 24, "Chennai", 79.3));
	        s.add(new Student(18, "Pooja", 20, "Delhi", 93.7));
	        s.add(new Student(19, "Ramesh", 21, "Hyderabad", 68.9));
	        s.add(new Student(20, "Shalini", 23, "Mumbai", 82.4));

	        s.add(new Student(21, "Ajay", 22, "Pune", 77.5));
	        s.add(new Student(22, "Neha", 20, "Kolkata", 89.2));
	        s.add(new Student(23, "Deepak", 24, "Chennai", 74.8));
	        s.add(new Student(24, "Kavya", 21, "Delhi", 96.1));
	        s.add(new Student(25, "Hari", 23, "Hyderabad", 70.6));
	        s.add(new Student(26, "Swathi", 22, "Mumbai", 83.9));
	        s.add(new Student(27, "Vishal", 20, "Pune", 88.0));
	        s.add(new Student(28, "Radha", 21, "Kolkata", 91.2));
	        s.add(new Student(29, "Ganesh", 24, "Chennai", 75.7));
	        s.add(new Student(30, "Bhavana", 23, "Delhi", 86.5));

	        s.add(new Student(31, "Ashok", 22, "Hyderabad", 79.9));
	        s.add(new Student(32, "Preethi", 20, "Mumbai", 94.3));
	        s.add(new Student(33, "Kiran", 21, "Pune", 68.2));
	        s.add(new Student(34, "Anusha", 23, "Kolkata", 85.7));
	        s.add(new Student(35, "Mohan", 24, "Chennai", 72.1));
	        s.add(new Student(36, "Revathi", 22, "Delhi", 90.8));
	        s.add(new Student(37, "Sanjay", 20, "Hyderabad", 66.4));
	        s.add(new Student(38, "Lavanya", 21, "Mumbai", 82.9));
	        s.add(new Student(39, "Rohit", 23, "Pune", 87.6));
	        s.add(new Student(40, "Indira", 24, "Kolkata", 93.1));
//		System.out.println(s);
		
//		System.out.println("Student List:");
//        for (Student st : s) {
//            System.out.println(st);
//        }
        s.sort(new NameComparator().thenComparing(new CityComparator()));
        for (Student st : s) {
            System.out.println(st);
        }

	}

}
