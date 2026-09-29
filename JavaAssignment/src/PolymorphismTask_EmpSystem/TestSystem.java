package PolymorphismTask_EmpSystem;

public class TestSystem {

	static void generateSalarySlip(Employee emp) {

		System.out.println("\n==============================");
		System.out.println("        SALARY SLIP");
		System.out.println("==============================");

		emp.displayDetails();

		System.out.println("Final Salary: " + emp.calculateSalary());

		System.out.println("==============================");
	}

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];

		employees[0] = new Developer(101, "Rahul", 50000);
		employees[1] = new Tester(102, "Priya", 40000);
		employees[2] = new Manager(103, "Amit", 70000);
		employees[3] = new HR(104, "Sneha", 45000);

		// Dynamic Method Dispatch
		for (Employee emp : employees) {

			System.out.println("\nEmployee: " + emp.name);

			System.out.println("Calculated Salary: " + emp.calculateSalary());
		}

		// Salary slips
		System.out.println("\n\nSALARY SLIPS");

		for (Employee emp : employees) {

			generateSalarySlip(emp);
		}
	}

}
