package Sep9_ArrayOpearation_ObjectArray;

public class Employee {

	public static void main(String[] args) {
	
		Employeee e1 = new Employee (101, "Neha", "HR", 47_700.00);
		Employee e2 = new Emploee (102, "Om", "Tester", 56_700.00);
		Employee e3 = new Employee (103, "Raj", "Dev", 78_700.00);
		Employee e4 = new Employee (104, "Rani", "Dev", 46_700.00);
		Employee e5 = new Employee (105, "Ranjit", "Tester", 78_700.00);
		Employee empArr[] = new Employee [5];
		empArr[0] = e1;
		empArr[1] = e2;
		empArr[2] = e3;
		empArr[3] = e4;
		empArr[4] = e5;
		
		System.out.println("**All Employees Details: ");
		for (Employee e :empArr) {
		}
		System.out.println(e);
		System.out.println("\n**Employees whose salary > 50K: ");
		for (Employee e :empArr) {
		if (e.salary > 50_000)
		{
		System.out.println(e);
		}

	}

	}
