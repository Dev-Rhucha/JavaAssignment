package sep18Inheritance;

public class SalaryAcc extends Account {

	public SalaryAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public String toString() {
		return "SalaryAcc [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
