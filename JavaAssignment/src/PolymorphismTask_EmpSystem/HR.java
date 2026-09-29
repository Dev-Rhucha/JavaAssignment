package PolymorphismTask_EmpSystem;

public class HR extends Employee{

	public HR(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
	
	}
	  @Override
	    double calculateSalary() {

	        double allowance = basicSalary * 0.10;
	        double bonus = 4000;
	        double deduction = basicSalary * 0.03;

	        return basicSalary + allowance + bonus - deduction;
	    }
}
