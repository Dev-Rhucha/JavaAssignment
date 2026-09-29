package Aug25;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	String category;

	void register(int Id, String pname, double pprice, int pquantity,String pcategory) {
		id = Id;
		name = pname;
		price = pprice;
		quantity = pquantity;
		category=pcategory;
	}

	void display() {
		System.out.println("Product Id : " + id);
		System.out.println("Product Name : " + name);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
	}

	void UpdateName(String pname) {
		name = pname;
		System.out.println("Name updated sucessfully"+" :"+name);
	}

	void updatePrice(double pprice) {
		if (pprice > 0) {
			price = pprice;
			System.out.println("price updated sucessfully"+" :"+price);
		} else {
			System.out.println("Invalid Price");
		}
	}

	void updateQuantity(int pquantity) {
		if (pquantity >= 0) {
			quantity = pquantity;
			System.out.println("quantity updated sucessfully"+" :"+quantity);
		} else {
			System.out.println("Invalid Quantity");
		}
	}
}
