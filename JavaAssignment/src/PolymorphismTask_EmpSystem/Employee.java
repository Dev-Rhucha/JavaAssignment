package PolymorphismTask_EmpSystem;

public class Employee {
	int empId;
	String name;
	double basicSalary;

	public Employee(int empId, String name, double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	double calculateSalary() {
		return basicSalary;
	}

	void displayDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Basic Salary: " + basicSalary);
	}
}
