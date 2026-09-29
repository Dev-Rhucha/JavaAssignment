package InheritanceTask2;

public class Vehicle  {
	protected String vehicleNo;
	protected String brand;
	protected double price;

	public Vehicle(String vehicleNo, String brand, double price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}

	public void start() {
		System.out.println("Vehicle is starting");
	}

	public double calculateInsurance() {
		return 0;
	}

	@Override
	public String toString() {
		return "Vehicle No: " + vehicleNo +
				"\nBrand: " + brand +
				"\nPrice: " + price;
	}
}
