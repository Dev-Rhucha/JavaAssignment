package sep18Inheritance;

public class TestAccount {

	public static void main(String[] args) {
		

		SavingAcc saving = new SavingAcc(101, "Rahul", 50000);

		CurrentAcc current = new CurrentAcc(102, "Amit", 75000);

		SalaryAcc salary = new SalaryAcc(103, "Rohit", 60000);

		System.out.println(saving);
		System.out.println(current);
		System.out.println(salary);
		
		
		saving.deposit(10000);
		System.out.println(saving);
		
		current.withdraw(1000);
		System.out.println(current);
		
		
		current.withdraw(71000);
		System.out.println(current);
	}

}
