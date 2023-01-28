package section_4;

public class BoundedTypes2 {

	public static void main(String[] args) {

		Person p1 = new Person(21, "Ayush");
		Person p2 = new Person(35, "Goldi");

		System.out.println(findMin(p1, p2));

	}

	public static <T extends Comparable<T>> T findMin(T person1, T person2) {

		if (person1.compareTo(person2) < 0)
			return person1;
		else
			return person2;
	}
}

class Person implements Comparable<Person> {
	int age;
	String name;

	public Integer getAge() {
		return this.age;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person person2) {
		if (this.age < person2.getAge())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
