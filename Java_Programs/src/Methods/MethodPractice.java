package Methods;

import java.util.Scanner;

public class MethodPractice {
	
	static void isEvenNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even Num");
		}
		else
		{
			System.out.println("not even");
		}
		sc.close();	
	}
	
	static void getMaxNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2:");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(" Num1 is greater");
		}
		else if(num2>num1)
		{
			System.out.println("num2 greater");
		}
		sc.close();	
	}
	
	static void CallByValue()
	{
		System.out.println("Hii");
		
		solve();
		
		
		
	}
	
	static void solve()
	{
		int num=5*10;
		System.out.println(num);
		
	}
	
	

	public static void main(String[] args) {
int num=5;

		isEvenNum();
		getMaxNum();
		CallByValue();
		System.out.println(num);// print 5 
		
	}

}

