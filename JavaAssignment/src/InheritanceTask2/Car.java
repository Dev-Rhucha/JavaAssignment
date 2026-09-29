package InheritanceTask2;

public class Car extends Vehicle{
	final double INSURANCE_RATE = 8;

	public Car(String vehicleNo, String brand, double price) {
		super(vehicleNo, brand, price);
	}

	@Override
	public void start() {
		System.out.println("Car is starting with key");
	}

	@Override
	public double calculateInsurance() {
		return price * INSURANCE_RATE / 100;
	}

	@Override
	public String toString() {
		return "Vehicle Type: Car" +
				"\nVehicle No: " + vehicleNo +
				"\nBrand: " + brand +
				"\nPrice: " + price +
				"\nInsurance Rate: " + INSURANCE_RATE + "%" +
				"\nInsurance Amount: " + calculateInsurance();
	}
}
