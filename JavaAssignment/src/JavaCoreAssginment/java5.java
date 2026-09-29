package JavaCoreAssginment;

import java.util.Scanner;

public class java5 {
	
		

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // 21. Multiplication Table
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= 10; i++) {
		            System.out.println(n + " x " + i + " = " + (n * i));
		        }


		        // 22. Even numbers between 1 and 100 and their total
		        int total = 0;

		        System.out.println("\nEven numbers from 1 to 100:");

		        for (int i = 1; i <= 100; i++) {
		            if (i % 2 == 0) {
		                System.out.print(i + " ");
		                total = total + i;
		            }
		        }

		        System.out.println("\nTotal = " + total);


		        // 23. Factorial
		        System.out.print("\nEnter a number for factorial: ");
		        long factNum = sc.nextInt();

		        long factorial = 1;

		        for (int i = 1; i <= factNum; i++) {
		            factorial = factorial * i;
		        }

		        System.out.println("Factorial = " + factorial);


		        // 24. Prime Number
		        System.out.print("\nEnter a number to check prime: ");
		        int primeNum = sc.nextInt();

		        boolean isPrime = true;

		        if (primeNum <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i < primeNum; i++) {
		                if (primeNum % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println("Prime Number");
		        } else {
		            System.out.println("Not a Prime Number");
		        }


		        // 25. Palindrome
		        System.out.print("\nEnter a number to check palindrome: ");
		        int palindromeNum = sc.nextInt();

		        int original = palindromeNum;
		        int reverse = 0;

		        while (palindromeNum != 0) {
		            int digit = palindromeNum % 10;
		            reverse = reverse * 10 + digit;
		            palindromeNum = palindromeNum / 10;
		        }

		        if (original == reverse) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a Palindrome");
		        }

		        sc.close();
		    }
		

}
