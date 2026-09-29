package aug26;

public class Employee {
	int eid;
	String name;
	String role;
	double salary;

	public Employee() {
	}

	// new 2nd constructor ---
	Employee(int eid, String name, String role, double salary) {

		System.out.println("Welcome to register app");

		this.eid = eid;
		this.name = name;
		this.role = role;
		this.salary = salary;

		System.out.println(name + " >> register success");
	}

	void login() {
		System.out.println("login success");
	}

	void logout() {
		System.out.println("logout success");
	}
}
