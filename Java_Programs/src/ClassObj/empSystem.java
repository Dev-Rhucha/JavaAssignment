package ClassObj;

public class empSystem {

	public static void main(String[] args) {

		emp e1 = new emp();
		emp e2 = new emp();
		emp e3 = new emp();

		e1.empid = 1;
		e1.name = "Rahul";
		e1.age = 25;
		e1.role = "Tester";
		e1.salary = 30000;

		e2.empid = 2;
		e2.name = "Amit";
		e2.age = 28;
		e2.role = "Developer";
		e2.salary = 40000;

		e3.empid = 3;
		e3.name = "Sneha";
		e3.age = 24;
		e3.role = "Manager";
		e3.salary = 50000;

		e1.display();
		e1.salaryUpdate();
		e2.display();
		e2.salaryUpdate();
		e3.display();
		e3.salaryUpdate();

	}

}
