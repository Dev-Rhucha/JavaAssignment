package PolymorphismTask_BankingSystem;

public class CurrentAccount extends Account {
	
	final double rate=10;

	public CurrentAccount(int accNo, String name, Double balance) {
		super(accNo, name, balance);
		
	}
	
	@Override
	void  withdraw(double amount)
	{ 
		if(amount <= balance)
		{
			balance=balance-amount;
			
			System.out.println("money debited sucessfullly..."+"\n current balance:"+balance);
		}
		else
		{
			System.out.println("insufficient amount in Account");
		}
	}
	
	@Override
	void calculateInterest()
	{
		interest=balance*rate/100;
		balance=balance+interest;
		System.out.println("Total interest :"+interest+"Total balance adding interest:"+balance);
	}
}
