package InheritanceTask;

public class Testsystem {

	public static void main(String[] args) {
		
		PermanentEmployee p =
				new PermanentEmployee(101, "Rahul", 40000);

		ContractEmployee c =
				new ContractEmployee(102, "Priya", 30000);

		InternEmployee i =
				new InternEmployee(103, "Riya", 0);

		System.out.println(p);
		System.out.println("--------------------");

		System.out.println(c);
		System.out.println("--------------------");

		System.out.println(i);
	}

	}


