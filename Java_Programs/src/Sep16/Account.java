package Sep16;

public class Account {

	private int Accno;

	private String name;

	private double balance;

	public Account(int accno, String name, double balance) {
		super();
		Accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
