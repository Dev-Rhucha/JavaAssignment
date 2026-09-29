package PolymorphismTask_EmpSystem;

public class Manager extends Employee{

	public Manager(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);

	}
	   @Override
	    double calculateSalary() {

	        double allowance = basicSalary * 0.30;
	        double bonus = 10000;
	        double deduction = basicSalary * 0.10;

	        return basicSalary + allowance + bonus - deduction;
	    }
}
