package JavaCoreAssginment;

import java.util.Scanner;

public class Java_03 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num1:");
//		int num1=sc.nextInt();
//		System.out.println("Enter num2:");
//		int num2=sc.nextInt();
//		
//		
//		System.out.println(num1==num2);
		
		System.out.println("Enter attendance:");
		int attendence=sc.nextInt();
		System.out.println("enter Percentage:");
		int percentage=sc.nextInt();
		
		if(attendence>=75&&percentage>=40)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
		
	}

}
