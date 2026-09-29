package JAVA_PRACTICAL_TASK_SHEET;

import java.util.Scanner;

public class Relational_Logical_IfElse {

	public static void main(String[] args) {

		/*
		 * 6. Voting Eligibility • Take age from the user. • Print Eligible to Vote if
		 * age is 18 or more; otherwise print Not Eligible.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
	     int age =sc.nextInt();
	     
	     if(age>=18)
	     {
	    	 System.out.println("eligible for vote");
	     }
	     else
	     {
	    	 System.out.println("not eligible for vote");
	     }
		
	
	}

}
