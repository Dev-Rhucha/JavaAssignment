package PolymorphismFood_Delivery_Application;

public class FoodSystem {

	public static void main(String[] args) {
	
		Pizza p1=new Pizza(101,"pizza",100.00);
		
		double price1=p1.calculatePrice();
		System.out.println(price1);
		p1.displayItem();

	}

}
