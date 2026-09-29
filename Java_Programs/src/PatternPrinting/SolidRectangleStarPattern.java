package PatternPrinting;

import java.util.Scanner;

public class SolidRectangleStarPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=6;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();	
	}

}
