package InheritanceTask4;

public class IndustrialConnection  extends ElectricityConnection{
	 double RATE = 12.00;

	public IndustrialConnection(int consumerNo, String name, double units) {
		super(consumerNo, name, units);
	}

	@Override
	public double calculateBill() {
		return units * RATE;
	}

	@Override
	public String toString() {

		return "Connection Type: Industrial" +
				"\nConsumer No: " + consumerNo +
				"\nName: " + name +
				"\nUnits: " + units +
				"\nRate: " + RATE +
				"\nBill Amount: " + calculateBill() +
				"\nOutstanding Bill: " + outstandingBill;
	}
}
