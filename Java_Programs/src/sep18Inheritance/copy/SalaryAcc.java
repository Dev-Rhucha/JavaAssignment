package sep18Inheritance.copy;

public class SalaryAcc extends Account {

	protected  double MIN_BAL = 0.0;

	public SalaryAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amt) {

		if (balance - amt >= MIN_BAL) {
			balance = balance - amt;
			System.out.println("Salary Account withdrawal successful");
		} else {
			System.err.println("Insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "SalaryAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
