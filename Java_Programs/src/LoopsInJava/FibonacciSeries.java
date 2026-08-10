package LoopsInJava;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		
		
				int a = 0 , b = 1 , c;
				int range = 10;
				System.out.print(a + " ");
				System.out.print(b + " ");
				
				for (int i = 1 ; i <= range -2; i++) {
				c = a + b;
				
				System.out.print(c + " ");
				a = b;
				b = c;
				}
	}

}
