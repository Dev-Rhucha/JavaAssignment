package Sep9_ArrayOpearation_ObjectArray;

public class Employeee {

	int eid;
	String name;
	String role;
	double salary;
	
	Employeee() {
	}
	
	Employeee (int eid, String name, String role,int salary)
	{
	this.eid=eid;
	this.name = name;
	this.role = role;
	this.salary = salary;
	}
	// display --> toString()
	public String toString() {
	return "Employee [eid=" + eid + ",name="+name+",role="+role+",salary="+salary;
	}

}
