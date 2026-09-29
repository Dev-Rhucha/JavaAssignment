package InheritanceTask;

public class InternEmployee extends Employee{

	public InternEmployee(int empid, String emp_name, double salary) {
		super(empid, emp_name, salary);
		
	}
 double STIPEND = 15000.00;

	

	@Override
	public double calculatesalary() {
		return STIPEND;
	}

	@Override
	public String toString() {
		return "Employee Type: Intern" +
				"\nEmployee ID: " + empid +
				"\nName: " + emp_name +
				"\nStipend: " + STIPEND +
				"\nFinal Salary: " + calculatesalary();
	}
}
