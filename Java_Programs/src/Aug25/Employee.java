package Aug25;

public class Employee {
	int id;
	String name;
	String role;
	int age;
	double salary;

	void register(int Id, String ename,int eAge, String eRole, double Salary) {

		id = Id;
		name = ename;
		role = eRole;
		age=eAge;
		salary = Salary;

	}

	void display() {
		System.out.println("id of employee is " + id);
		System.out.println("name of employee is " + name);
		System.out.println("role of employee is " + role);
		System.out.println("salary of employee is " + salary);
		

	}
	
	
	void UpdateName(String name)
	{
		this.name=name;
		System.out.println(name+": "+"Name Updated Sucessfully");
	}
	
	void update_salary (double salary)
	{
		if(salary>0&&salary>this.salary)
		{
			this.salary=salary;
			System.out.println(salary+": "+"Salary Updated Sucessfully");
		}
		else
		{
			System.out.println("Invalid Operation");
		}
	}
	
	
	void updateAge(int age)
	{
		if(age>18)
		{
			this.age=age;
		}
		System.out.println(age+": "+"Age updated Sucessfully");
	}
	
	
}
