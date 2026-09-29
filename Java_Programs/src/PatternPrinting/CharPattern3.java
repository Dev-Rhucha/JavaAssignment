package PatternPrinting;

public class CharPattern3 {

	public static void main(String[] args) {
	
	int n=68;
	
	for(int  i=65;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		
		for(char j=65;j<=i;j++)
		{
			System.out.print(j);
		}
	
		int dcreRow=i-1;
		for(int j=65;j>=i-1;j++)
		{
			System.out.println(dcreRow+" ");
			dcreRow++;
			
		}
		System.out.println();
	}
	
	
	
		

	}

}
