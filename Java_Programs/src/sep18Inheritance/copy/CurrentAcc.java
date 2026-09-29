package sep18Inheritance.copy;


public class CurrentAcc extends Account {
	
	protected  double MIN_BAL = 5000.00;


	public CurrentAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amt) {

		if (balance - amt >= MIN_BAL) {
			balance = balance - amt;
			System.out.println("Current Account withdrawal successful");
		} else {
			System.err.println("Cannot withdraw. Minimum balance of " + MIN_BAL + " must be maintained.");
		}
	}
	@Override
	public String toString() {
		return "CurrentAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
