package immutable;

public final class Person {

	private final String name;
	private final int Uid;

	public Person(String name, int uid) {
		super();
		this.name = name;
		Uid = uid;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", Uid=" + Uid + "]";
	}

	public int getUid() {
		return Uid;
	}

}
