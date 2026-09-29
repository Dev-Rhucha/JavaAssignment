package Aug21_classObj;

public class Laptop {
	
	String brand;
	String Model;
	int Ram;
	int Storage;
	double price;
	String color;

	void Info(String brand,String Model, int RAM,int Storage,double price,String color) {

		this.brand=brand;
		this.Model=Model;
		this.Ram=RAM;
		this.Storage=Storage;
		this.price=price;
		this.color=color;
		
	}

	void display()
	{
		System.out.println("\nInformation Of Product:---");
		System.out.println("Brand :"+brand);
		System.out.println("Model:"+Model);
		System.out.println("RAM:"+Ram);
		System.out.println("Storange"+Storage);
		System.out.println("price"+price);
		System.out.println("color is"+color);
	}

}
