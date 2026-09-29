package aug26;

public class BankSys {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(201, "Rahul", "Savings", 50000.00);

		b1.deposit();
		b1.withdraw();

		BankAccount dbank = new BankAccount();
		dbank.accountNo = 11;
	}

}
