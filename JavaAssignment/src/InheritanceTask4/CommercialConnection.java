package InheritanceTask4;

public class CommercialConnection  extends ElectricityConnection {
 double RATE = 8.00;

	public CommercialConnection(int consumerNo, String name, double units) {
		super(consumerNo, name, units);
	}

	@Override
	public double calculateBill() {
		return units * RATE;
	}

	@Override
	public String toString() {

		return "Connection Type: Commercial" +
				"\nConsumer No: " + consumerNo +
				"\nName: " + name +
				"\nUnits: " + units +
				"\nRate: " + RATE +
				"\nBill Amount: " + calculateBill() +
				"\nOutstanding Bill: " + outstandingBill;
	}
}
