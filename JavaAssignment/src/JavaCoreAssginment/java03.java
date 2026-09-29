package JavaCoreAssginment;

import java.util.Scanner;

public class java03 {

	public static void main(String[] args) {
		

		 
		        Scanner sc = new Scanner(System.in);

//		        // 15. Positive, Negative or Zero
//		        System.out.print("Enter a number: ");
//		        int n = sc.nextInt();
//
//		        if (n > 0) {
//		            System.out.println("Positive");
//		        } else if (n < 0) {
//		            System.out.println("Negative");
//		        } else {
//		            System.out.println("Zero");
//		        }
//
//
//		        // 16. Even or Odd
//		        System.out.print("\nEnter an integer: ");
//		        int num = sc.nextInt();
//
//		        if (num % 2 == 0) {
//		            System.out.println("Even");
//		        } else {
//		            System.out.println("Odd");
//		        }
//
//
//		        // 17. Leap Year
//		        System.out.print("\nEnter a year: ");
//		        int year = sc.nextInt();
//
//		        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//		            System.out.println("Leap Year");
//		        } else {
//		            System.out.println("Not a Leap Year");
//		        }
//
//
//		        // 18. Vowel or Consonant
//		        System.out.print("\nEnter a character: ");
//		        char ch = sc.next().charAt(0);
//
//		        if (ch == 'a' || ch == 'e' || ch == 'i' ||
//		            ch == 'o' || ch == 'u' ||
//		            ch == 'A' || ch == 'E' || ch == 'I' ||
//		            ch == 'O' || ch == 'U') {
//
//		            System.out.println("Vowel");
//		        } else {
//		            System.out.println("Consonant");
//		        }
//
//
//		        // 19. Grade
//		        System.out.print("\nEnter student's percentage: ");
//		        double percentage = sc.nextDouble();
//
//		        if (percentage >= 75) {
//		            System.out.println("Distinction");
//		        } else if (percentage >= 60) {
//		            System.out.println("First Class");
//		        } else if (percentage >= 50) {
//		            System.out.println("Second Class");
//		        } else if (percentage >= 40) {
//		            System.out.println("Pass");
//		        } else {
//		            System.out.println("Fail");
//		        }


		        // 20. Simple Calculator using switch
		        System.out.print("Enter first number: ");
		        double a = sc.nextDouble();

		        System.out.print("Enter second number: ");
		        double b = sc.nextDouble();

		        System.out.print("Enter operator (+, -, *, /): ");
		        char operator = sc.next().charAt(0);

		        switch (operator) {

		            case '+':
		                System.out.println("Result = " + (a + b));
		                break;

		            case '-':
		                System.out.println("Result = " + (a - b));
		                break;

		            case '*':
		                System.out.println("Result = " + (a * b));
		                break;

		            case '/':
		                System.out.println("Result = " + (a / b));
		                break;

		            default:
		                System.out.println("Invalid operator");
		        }

		        sc.close();
		    }
		}
	
