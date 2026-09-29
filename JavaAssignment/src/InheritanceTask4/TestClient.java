package InheritanceTask4;

public class TestClient {

	public static void main(String[] args) {
		
		DomesticConnection d =
				new DomesticConnection(101, "Rahul", 200);

		CommercialConnection c =
				new CommercialConnection(102, "Priya", 500);

		IndustrialConnection i =
				new IndustrialConnection(103, "Riya", 1000);


		System.out.println("===== DOMESTIC CONNECTION =====");

		System.out.println(d);

		d.payBill(500);

		System.out.println("\nAfter Payment:");
		System.out.println(d);


		System.out.println("\n==============================");


		System.out.println("===== COMMERCIAL CONNECTION =====");

		System.out.println(c);

		c.payBill(2000);

		System.out.println("\nAfter Payment:");
		System.out.println(c);


		System.out.println("\n==============================");


		System.out.println("===== INDUSTRIAL CONNECTION =====");

		System.out.println(i);

		i.payBill(5000);

		System.out.println("\nAfter Payment:");
		System.out.println(i);
	}
	}


