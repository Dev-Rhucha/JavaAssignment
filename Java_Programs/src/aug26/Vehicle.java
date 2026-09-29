package aug26;

public class Vehicle {
	int id;
	String brand;
	String model;
	double price;

	public Vehicle() {
	}

	
	Vehicle(int id, String brand, String model, double price) {

		System.out.println("Welcome to vehicle app");

		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;

		System.out.println(brand + " >> vehicle registered successfully");
	}

	void start() {
		System.out.println("Vehicle started");
	}

	void stop() {
		System.out.println("Vehicle stopped");
	}
}
