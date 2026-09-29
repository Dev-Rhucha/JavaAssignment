package aug26;

public class TestAppEmpSys {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Rajesh", "HR", 77000.00);

		e1.login();
		e1.logout();

		Employee demp = new Employee();
		demp.eid = 11;

	}

}
