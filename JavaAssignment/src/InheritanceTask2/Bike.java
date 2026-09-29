package InheritanceTask2;


public class Bike extends Vehicle {

	final double INSURANCE_RATE = 5;

	public Bike(String vehicleNo, String brand, double price) {
		super(vehicleNo, brand, price);
	}

	@Override
	public void start() {
		System.out.println("Bike is starting with self-start");
	}

	@Override
	public double calculateInsurance() {
		return price * INSURANCE_RATE / 100;
	}

	@Override
	public String toString() {
		return "Vehicle Type: Bike" +
				"\nVehicle No: " + vehicleNo +
				"\nBrand: " + brand +
				"\nPrice: " + price +
				"\nInsurance Rate: " + INSURANCE_RATE + "%" +
				"\nInsurance Amount: " + calculateInsurance();
	}

}
