package PolymorphismFood_Delivery_Application;

import java.util.Scanner;

public class FoodItem {
	int itemId;
	String itemName;
	double price;

	public FoodItem(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	double calculatePrice() {
		return price;
	}

	void displayItem() {
		System.out.println("ItemId:"+itemId);
		System.out.println("itemName:"+itemName);
 System.out.println("price"+price);
	}
}

class Pizza extends FoodItem {
	

	public Pizza(int itemId, String itemName, double price) {
		super(itemId, itemName, price);

	}

	@Override
	double calculatePrice() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select Size :");
		String size=sc.next();
		
         double sizeCharge=0;
		if (size.equalsIgnoreCase("small")) {
			sizeCharge=50;
		}
		
		else if(size.equalsIgnoreCase("medium"))
		{
			sizeCharge=100;
		}
		
		else if(size.equalsIgnoreCase("Large"))
		{
			sizeCharge=150;
		}

		return price+sizeCharge;

	}

}

class Burger extends FoodItem

{

	public Burger(int itemId, String itemName, double price) {
		super(itemId, itemName, price);

	}

}

class Biryani extends FoodItem {

	public Biryani(int itemId, String itemName, double price) {
		super(itemId, itemName, price);

	}

}

class Dessert extends FoodItem

{

	public Dessert(int itemId, String itemName, double price) {
		super(itemId, itemName, price);

	}

}

class Beverage extends FoodItem {

	public Beverage(int itemId, String itemName, double price) {
		super(itemId, itemName, price);

	}

}