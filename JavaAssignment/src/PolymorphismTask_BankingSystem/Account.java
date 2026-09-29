package PolymorphismTask_BankingSystem;

public class Account {
	 int accNo;
	 String name;
	 Double balance;
	 double rate;
	 double interest;
	 
	 
	 public Account(int accNo, String name, Double balance) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		} 
	 
	 
	void deposit(double amount) 
	{
		balance=balance+amount;
		System.out.println("money credited sucessfully "+"\n current balance:"+balance);
	}
	 
	 
	 
	void  withdraw(double amount)
	{ 
		if(balance!=0)
		{
			balance=balance-amount;
			
			System.out.println("money debited sucessfullly..."+"\n current balance:"+balance);
		}
		else
		{
			System.out.println("insufficient amount in Account");
		}
	}
	
	void calculateInterest()
	{
		System.out.println("No interest");
	}



	
}
