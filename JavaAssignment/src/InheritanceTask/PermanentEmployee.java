package InheritanceTask;

public class PermanentEmployee extends Employee {

	public PermanentEmployee(int empid, String emp_name, double salary) {
		super(empid, emp_name, salary);
		
	}

	
	public double calculatesalary()
	{
		return salary+5000;
		
	}
	
	
	@Override
	public String toString()
	{
		return " Employee type:Permanant "+"\nempid=" + empid + "\nemp_name="+emp_name+"\nsalary="+salary+"final salary ="+calculatesalary();
	}
}
