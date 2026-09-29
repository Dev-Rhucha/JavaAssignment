package InheritanceTask2;

public class Truck extends Vehicle {

	final double INSURANCE_RATE = 12;

	public Truck(String vehicleNo, String brand, double price) {
		super(vehicleNo, brand, price);
	}

	@Override
	public void start() {
		System.out.println("Truck is starting with heavy engine");
	}

	@Override
	public double calculateInsurance() {
		return price * INSURANCE_RATE / 100;
	}

	@Override
	public String toString() {
		return "Vehicle Type: Truck" +
				"\nVehicle No: " + vehicleNo +
				"\nBrand: " + brand +
				"\nPrice: " + price +
				"\nInsurance Rate: " + INSURANCE_RATE + "%" +
				"\nInsurance Amount: " + calculateInsurance();
	}
}
