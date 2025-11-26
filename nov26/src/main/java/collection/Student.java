package collection;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private double marks;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, String city, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", marks=" + marks + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
//	@Override
//	public int compareTo(Student S) {
//		// TODO Auto-generated method stub
//		return this.id -S.id;
//	}
	@Override
	public int compareTo(Student S) {
		// TODO Auto-generated method stub
		return (int) (this.marks -S.marks);
	}
//	@Override
//	public int compareTo(Student S) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(S.name);
//	}
//	

}
