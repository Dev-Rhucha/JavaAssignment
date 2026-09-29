package PolymorphismTask_EmpSystem;

public class Tester extends Employee{

	public Tester(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
	
	}
	@Override
    double calculateSalary() {

        double allowance = basicSalary * 0.15;
        double bonus = 3000;
        double deduction = basicSalary * 0.04;

        return basicSalary + allowance + bonus - deduction;
    }
}
