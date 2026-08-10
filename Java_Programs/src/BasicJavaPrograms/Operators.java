package BasicJavaPrograms;

public class Operators {

	public static void main(String[] args) {
		
		
		// Post incr [ a++]: First use then update itself
		// Pre incr [ ++a]: First update then use 6
		
	
		
		//1 swapping of two numbers
		
		

//		        int a = 10;
//		        int b = 20;
//
//		        int temp = a;
//		        a = b;
//		        b = temp;
//
//		        System.out.println("a = " + a);
//		        System.out.println("b = " + b);
		    
		
		
		//2 swapping of two numbers without using 3rd variable..
		
		

//		        int a = 10;
//		        int b = 20;
//
//		        a = a + b;
//		        b = a - b;
//		        a = a - b;
//
//		        System.out.println("a = " + a);
//		        System.out.println("b = " + b);
		    
		
		
		//3 swapping of two numbers without using 3rd variable and arithmetic operators.
		
		
//
//		        int a = 10;
//		        int b = 20;
//
//		        a = a ^ b;
//		        b = a ^ b;
//		        a = a ^ b;
//
//		        System.out.println("a = " + a);
//		        System.out.println("b = " + b);
		    
		   int costPrice = 10;
	        int sellingPrice = 17;

	        if (sellingPrice > costPrice) {
	            System.out.println("Profit : " + (sellingPrice - costPrice) + " Rs");
	        } else if (costPrice > sellingPrice) {
	            System.out.println("Loss : " + (costPrice - sellingPrice) + " Rs");
		
	}
	}
}
