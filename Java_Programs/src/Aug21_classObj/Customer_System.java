package Aug21_classObj;

public class Customer_System {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		
		c1.register(1, "abc", "234567567", "abc@gmail.com", "abc@11", "abc11");
		c1.display();
		
		
		Customer c2=new Customer();
		c2.register(2, "xyz", "4567834", "xyz@gmail.com", "xyz@90", "xyz90");
		c2.display();
	}

}
