package immutable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Immutable Class");
		System.out.println(
				"1.class is final\n2.properties need to be final\n3.properties need to get values through constructor\n4.No setters to modify data");
		Person p = new Person("ichi", 6127);
		System.out.println(p);
	}

}
