package Aug21_classObj;

public class empSystem {

	public static void main(String[] args) {
		employee emp1=new employee();
		emp1.register(1, "abc", "dev", 245000);
		emp1.display();
		
		employee emp2=new employee();
		emp2.register(1, "xyz", "tester", 30000);
		emp2.display();
		
	}

}
