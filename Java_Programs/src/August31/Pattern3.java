package August31;

public class Pattern3 {

	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			if(i!=5)
			{
			for(int j=1;j<=n-1;j++)
			{
				System.out.print("* ");
			}
			
			for(int j=1;j<=n-4;j++)
			{
				System.out.print("$ ");
			}
			
			
			}
			
			else
			{
				for(int k=1;k<=n;k++)
				{
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
		
	
	}
}
