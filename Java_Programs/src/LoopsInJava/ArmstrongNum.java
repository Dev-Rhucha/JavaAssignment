package LoopsInJava;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num=sc.nextInt();
		
		
		
		int sum=0;
		
		int copyofnum=num;
		
		while(num!=0)
		{
			int digit=num%10;
			
			int n=digit*digit*digit;
		sum=sum+n;
			num=num/10;
		}
		
		if(copyofnum==sum)
		{
			System.out.println("num is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
		sc.close();	
	}

}
