package Methods;

public class Calculator {
	
	static void calculator(int a,int b)
	{
		
		int sum=a+b;
		int mul=a*b;
		int sub=a-b;
		float div=a/b;
		int mod=a%b;
		
		System.out.println("Sum is :"+sum);
		
		System.out.println("mul is :"+mul);

		System.out.println("Sub is :"+sub);

		System.out.println("div is :"+div);

		System.out.println("mod is :"+mod);

	}

	public static void main(String[] args) {
		
		calculator(34,12);

		
	}

}
