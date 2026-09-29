package Methods;



public class Circle {
	
	
	static int radius=6;
	static float pi=3.14f;
	static void areaOfCircle()
	{

		System.out.println(pi*radius*radius);
		
	}
	
	static void Circumference ()
	{
		System.out.println(2*pi*radius);
	}
	
	
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter radium:" );
//		int radius=sc.nextInt();
		
		
		areaOfCircle();
		Circumference();
		

	}

}
