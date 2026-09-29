package aug26;

public class VehicleSys {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(301, "Honda", "City", 850000.00);

		v1.start();
		v1.stop();

		Vehicle dvehicle = new Vehicle();
		dvehicle.id = 11;
	}

}
