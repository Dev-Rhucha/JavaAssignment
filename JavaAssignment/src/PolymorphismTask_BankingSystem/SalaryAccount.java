package PolymorphismTask_BankingSystem;

public class SalaryAccount extends Account{
	
	
	final double rate=15;
	public SalaryAccount(int accNo, String name, Double balance) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void  withdraw(double amount)
	{ 
		if(amount <= balance)
		{
			balance=balance-amount;
			System.out.println("money withdraw succsefull"+"\ncureent balance :"+balance);
		}
		
		else
		{
			System.out.println("insufficient balance");
		}
	}
	
	@Override
	void calculateInterest()
	{
		interest=balance*rate/100;
		System.out.println("salary Account interest:"+interest);
		
	}
}
