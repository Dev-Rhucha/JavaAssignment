package Sep16;

public class Employee {

	private int eid;
	private String ename;
	private String mob;
	private int age;
	private double salary;
	public Employee(int eid, String ename, String mob, int age, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mob = mob;
		this.age = age;
		this.salary = salary;
		
		
		
		
	       if (age > 18) {
	            this.age = age;
	        } else {
	            System.out.println("Age should be greater than 18");
	        }

	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Salary should be greater than 0");
	        }

	        if (mob.length() == 10) {
	            this.mob = mob;
	        } else {
	            System.out.println("Mobile number should contain exactly 10 digits");
	        }
	    }
	
	
	
	@Override
	public String toString() {
	    return "Student[eid=" + eid + ", name=" + ename + ", mobNum=" + mob + ",age="+age+",salary="+salary+"]";
	}
	
	

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be greater than 18");
        }
    }


    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.err.println("Invalid salary. Salary should be greater than 0");
        }
    }


    public void setMob(String mob) {

        if (mob.length() == 10) {
            this.mob = mob;
        } else {
            System.err.println("Invalid mobile number. It should contain exactly 10 digits");
        }
    }
 public static void main(String[] args) {
	
	 Employee emp1=new Employee(101,"abc","3456784556",34,30000.00);
	 Employee emp2=new Employee(102,"xyz","3445785678",35,60000.00);

	System.out.println(emp1);
System.out.println(emp2);

emp1.setAge(30);
System.out.println(emp1);


emp1.setAge(15);


emp1.setSalary(40000);
System.out.println(emp1);

emp1.setSalary(0);


emp1.setMob("9876543211");
System.out.println(emp1);


emp1.setMob("987654");
}
}
