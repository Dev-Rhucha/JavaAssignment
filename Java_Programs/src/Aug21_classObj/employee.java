package Aug21_classObj;

public class employee {

	int id;
	String name;
	String role;
	int salary;

	void register(int Id, String ename, String eRole, int Salary) {

		id = Id;
		name = ename;
		role = eRole;
		salary = Salary;

	}

	void display() {
		System.out.println("id of employee is " + id);
		System.out.println("name of employee is " + name);
		System.out.println("role of employee is " + role);
		System.out.println("salary of employee is " + salary);
		

	}

}
