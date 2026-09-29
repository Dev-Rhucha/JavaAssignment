package PolymorphismTask_BankingSystem;

public class SavingAccount extends Account{
	
	final double rate=13.5;

	public SavingAccount(int accNo, String name, Double balance) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void  withdraw(double amount)
	{ 
		if(balance-amount>1000)
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
		System.out.println("Saving Account interest:"+interest);
	}
}
