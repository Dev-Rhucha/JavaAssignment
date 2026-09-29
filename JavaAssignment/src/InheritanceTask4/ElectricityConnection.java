package InheritanceTask4;

public class ElectricityConnection {
	protected int consumerNo;
	protected String name;
	protected double units;
	protected double outstandingBill;

	public ElectricityConnection(int consumerNo, String name, double units) {
		this.consumerNo = consumerNo;
		this.name = name;
		this.units = units;
	}

	public double calculateBill() {
		return 0;
	}

	public void payBill(double amt) {

		double bill = calculateBill();

		if (amt <= 0) {
			System.out.println("Invalid payment amount");
		} 
		else if (amt > bill) {
			System.out.println("Payment cannot be greater than bill amount");
		} 
		else {
			outstandingBill = bill - amt;
			System.out.println("Payment successful");
		}
	}

	@Override
	public String toString() {

		return "Consumer No: " + consumerNo +
				"\nName: " + name +
				"\nUnits: " + units +
				"\nBill Amount: " + calculateBill() +
				"\nOutstanding Bill: " + outstandingBill;
	}
}
