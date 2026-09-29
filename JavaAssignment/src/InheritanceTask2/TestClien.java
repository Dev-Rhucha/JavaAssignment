package InheritanceTask2;

public class TestClien {

	public static void main(String[] args) {
		
		
		Car c = new Car("MH09AB1234", "Toyota", 800000);

		Bike b = new Bike("MH09CD5678", "Honda", 100000);

		Truck t = new Truck("MH09EF9012", "Tata", 2000000);

		System.out.println(c);
		c.start();

		System.out.println("----------------------");

		System.out.println(b);
		b.start();

		System.out.println("----------------------");

		System.out.println(t);
		t.start();
	}

}
