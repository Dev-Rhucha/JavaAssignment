package sep18Inheritance;

public class SavingAcc extends Account {

	public SavingAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public String toString() {
		return "SavingAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
