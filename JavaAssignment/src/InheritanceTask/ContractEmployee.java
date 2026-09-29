package InheritanceTask;

public class ContractEmployee extends Employee{

	public ContractEmployee(int empid, String emp_name, double salary) {
		super(empid, emp_name, salary);
		
		
	}
	
	@Override
	public double calculatesalary()
	{
		return salary-(salary*10/100);
	}
	
	

@Override
public String toString() {
	return "Employee Type: Contract" +
			"\nEmployee ID: " + empid +
			"\nName: " + emp_name +
			"\nBasic Salary: " + salary +
		"\nFinal Salary: " + calculatesalary();
}
}
