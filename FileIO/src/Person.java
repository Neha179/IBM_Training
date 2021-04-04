import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private transient int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [Name = " + name + ", age = " + age + "]";
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
