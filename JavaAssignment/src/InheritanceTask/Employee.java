package InheritanceTask;

public class Employee {

	protected int empid;
	protected String emp_name;
	protected double salary;
	
	
	public Employee(int empid, String emp_name, double salary ) {
		super();
		this.empid = empid;
		this.emp_name = emp_name;
		this.salary = salary;
		
	}
	

	public double calculatesalary()
	{
		return salary;
	}
	
	public void display()
	{
		System.out.println(this);
	}
	
	@Override
	public String toString()
	{
		return "Employee[empid=" + empid + "emp_name="+emp_name+"salary="+salary+"]";
	}
}
