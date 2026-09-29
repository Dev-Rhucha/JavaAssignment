package JAVA_PRACTICAL_TASK_SHEET;

import java.util.Scanner;

public class Datatypes_And_Operators {

	public static void main(String[] args) {

		/*
		 * 1. Student Information • Create variables for student name, age, percentage,
		 * gender and placement status. • Print all values clearly
		 */
		
		String name="abc";
		int age =24;
		float percentage=78.56f;
		String gender="male";
		boolean status=true;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(percentage);
		System.out.println();
		
		/*
		 * 2. Arithmetic Operations • Take two integers from the user. • Print addition,
		 * subtraction, multiplication, division and modulus.
		 */

		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first num:");
//		int n1=sc.nextInt();
//		System.out.println("enter second num:");
//		int n2=sc.nextInt();
//		
//		System.out.println(n1+n2);
//		System.out.println(n1-n2);
//		System.out.println(n1*n2);
//		System.out.println(n1/n2);
//		System.out.println(n1%n2);
//	
		/*
		 * 3 Rectangle Calculation • Take length and breadth from the user. • Calculate
		 * and print area and perimeter of the rectangle.
		 */	
	
		int len=45;
		
		int breadth=35;
		
		System.out.println("area is:" +(len*breadth));
	
		System.out.println("perimeter is "+2*(len+breadth));
		
		
		/*
		 * 4. Salary Calculation • Take basic salary from the user. • Calculate HRA =
		 * 20% of basic salary. • Calculate DA = 10% of basic salary. • Print Total
		 * Salary = Basic + HRA + DA.
		 * 
		 */
		
		System.out.println("enter salary:");
		int Basic_salary=sc.nextInt();
		int HRA=Basic_salary*20/100;
		int DA=Basic_salary*10/100;
		
		
		
		System.out.println("HRA is :"+HRA);
		System.out.println("DA is:"+DA);
		System.out.println("total salary:"+(Basic_salary+HRA+DA));
		
		/*
		 * 5. Student Percentage • Take marks of 3 subjects. • Calculate total marks and
		 * percentage.
		 */	
	
		int marathi=95;
		int english=67;
		int maths=78;
		System.out.println("Total marks:"+(marathi+english+maths));
		System.out.println("average is "+(marathi+english+maths)/3);
		
		
	
	}
	
	
	
	
        
	
	

}

