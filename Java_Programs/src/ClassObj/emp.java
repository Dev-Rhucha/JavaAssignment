package ClassObj;

public class emp {
	
	 int empid;
	    String name;
	    int age;
	    String role;
	    int salary;

	    void display()
	    {
	        System.out.println("Emp Id is: " + this.empid);
	        System.out.println("Name is: " + this.name);
	        System.out.println("Age is: " + this.age);
	        System.out.println("Role is: " + this.role);
	        System.out.println("Salary is: " + this.salary);
	    }
	    
	    void salaryUpdate()
	    {
	    	
	    	if(salary<15000)
	    	{
	    		int incresalary=salary*5/100;
	    		System.out.println("increment salary is:"+(salary+incresalary)); 
	    	}
	    	else if(salary>15000&&salary<40000)
	    	{
	    		int incresalary=salary*10/100;
	    		System.out.println("increment salary is:"+(salary+incresalary));
	    	}
	    	
	    	else if(salary>=40000&&salary<80000)
	    	{
	    		int incresalary=salary*15/100;
	    	System.out.println("increment salary is:"+(salary+incresalary));
	    	}
	    }

}
