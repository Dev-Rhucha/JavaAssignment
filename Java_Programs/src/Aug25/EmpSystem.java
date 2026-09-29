package Aug25;

public class EmpSystem {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.register(1, "abc", 34, "dev", 245000);
		emp1.display();
		emp1.UpdateName("abcd");
		emp1.updateAge(37);
		emp1.update_salary(28000);

		System.out.println("-------------------------------------------------");
		Employee emp2 = new Employee();
		emp2.register(2, "xyz", 26, "tester", 30000);
		emp2.display();
		emp2.UpdateName("xyp");
		emp2.updateAge(29);
		emp2.update_salary(45000);
	}

}
