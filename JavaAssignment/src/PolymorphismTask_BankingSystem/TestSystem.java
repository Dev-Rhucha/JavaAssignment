package PolymorphismTask_BankingSystem;

public class TestSystem {

	public static void performOp(Account acc) {
		acc.deposit(1000);
		acc.withdraw(2000);
		acc.calculateInterest();

		System.out.println("---------------------------------------------------");

	}

	public static void main(String[] args) {

		// CurrentAccount c=new CurrentAccount(101, "xyz", 10000.00);

		// c.deposit(1000);
		// c.withdraw(10000);
		// c.withdraw(1000);
		// c.calculateInterest();

//		SalaryAccount s=new SalaryAccount(101,"abc",20000.00);
//		
//		//s.withdraw(10000);
//		//s.calculateInterest();
//		s.deposit(2000);

		// SavingAccount s1=new SavingAccount(101,"abcd",20000.00);
		// s1.deposit(1000);
		// s1.withdraw(19500);

		// Account ac=new Account(101,"abc",10000.00);

		// ac.withdraw(1000);

		Account a1 = new SavingAccount(101, "Rahul", 10000.00);
		Account a2 = new CurrentAccount(102, "Amit", 15000.00);
		Account a3 = new SalaryAccount(103, "Sneha", 20000.00);

		performOp(a1);
		performOp(a2);
		performOp(a3);

	}

}
