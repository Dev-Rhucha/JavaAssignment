package InheritanceTask4;

public class DomesticConnection extends ElectricityConnection {
 double RATE = 5.00;

	public DomesticConnection(int consumerNo, String name, double units) {
		super(consumerNo, name, units);
	}

	@Override
	public double calculateBill() {
		return units * RATE;
	}

	@Override
	public String toString() {

		return "Connection Type: Domestic" +
				"\nConsumer No: " + consumerNo +
				"\nName: " + name +
				"\nUnits: " + units +
				"\nRate: " + RATE +
				"\nBill Amount: " + calculateBill() +
				"\nOutstanding Bill: " + outstandingBill;
	}
}
