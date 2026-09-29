package Aug25;

public class ProductSystem {

	public static void main(String[] args) {
		
		Product p1 = new Product();

		p1.register(1, "Laptop", 50000, 10,"Electronics");
		p1.display();

		p1.UpdateName("HP Laptop");
		p1.updatePrice(55000);
		p1.updateQuantity(15);
		System.out.println("Updated information is :");
		p1.display();

		System.out.println("---------------------------------------------");

		Product p2 = new Product();

		p2.register(2, "Mobile", 25000, 20,"Electronics");
		p2.display();

		p2.UpdateName("Samsung Mobile");
		p2.updatePrice(28000);
		p2.updateQuantity(25);
		System.out.println("Updated information is :");
		p2.display();
	}

	}


