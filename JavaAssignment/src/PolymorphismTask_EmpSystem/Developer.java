package PolymorphismTask_EmpSystem;

public class Developer extends Employee{

	public Developer(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
		
	}
	  @Override
	    double calculateSalary() {

	        double allowance = basicSalary * 0.20;
	        double bonus = 5000;
	        double deduction = basicSalary * 0.05;

	        return basicSalary + allowance + bonus - deduction;
	    }
	}

