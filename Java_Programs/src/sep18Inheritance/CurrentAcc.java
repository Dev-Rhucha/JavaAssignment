package sep18Inheritance;


public class CurrentAcc extends Account {

	public CurrentAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public String toString() {
		return "CurrentAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
