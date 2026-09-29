package sep18Inheritance.copy;

public class SavingAcc extends Account {
	
	protected  double MIN_BAL = 1000.00;

	public SavingAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	
	
	@Override
	public void withdraw(double amt) {

		if (balance - amt >= MIN_BAL) {
			balance = balance - amt;
			System.out.println("Saving Account withdrawal successful");
		} else {
			System.err.println("Can't withdraw money . Minimum balance of " + MIN_BAL + " should be maintained.");
		}
	}
	@Override
	public String toString() {
		return "SavingAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
