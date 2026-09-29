package sep11New;

public class Student {

	int age;
	String name;

	Address address;

	public Student(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
	    return "Student[age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	public Student()
	{
		super();
	}
	
	
	

}
