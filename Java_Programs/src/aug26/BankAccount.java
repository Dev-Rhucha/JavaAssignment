package aug26;

public class BankAccount {

	int accountNo;
	String name;
	String type;
	double balance;

	public BankAccount() {
	}

	
	BankAccount(int accountNo, String name, String type, double balance) {

		System.out.println("Welcome to bank app");

		this.accountNo = accountNo;
		this.name = name;
		this.type = type;
		this.balance = balance;

		System.out.println(name + " >> account created successfully");
	}

	void deposit() {
		System.out.println("Deposit successful");
	}

	void withdraw() {
		System.out.println("Withdraw successful");
	}
}
