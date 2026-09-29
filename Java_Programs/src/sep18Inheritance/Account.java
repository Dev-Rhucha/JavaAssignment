package sep18Inheritance;

public class Account {

	protected int accNo;
	protected String name;
	protected double balance;

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amt) {
		if (amt <= balance) {
			balance = balance - amt;
			System.out.println("Withdraw successful");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("Deposit successful");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
