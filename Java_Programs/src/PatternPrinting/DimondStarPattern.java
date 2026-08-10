package PatternPrinting;

public class DimondStarPattern {

	public static void main(String[] args) {


		int n=4;
		
		for(int r=1;r<=n;r++)
		{
			for(int s1=1;s1<=n-r;s1++)
			{
				System.out.print("  ");
			
			}
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print("* ");
			}
			
			System.out.println();

		}
		
	
		
		for(int r=1;r<=n;r++)
		{
			for(int col=1;col<=r;col++)
			{
				System.out.print("  ");
			}
			
			for(int col=1;col<=2*n-2*r-1;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
