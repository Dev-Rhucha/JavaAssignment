package PatternPrinting;

public class CharcterPrintingPattern {

	public static void main(String[] args) {
		
		
		int n=104;
		
		for(char i=97;i<=n;i++)
		{
			for(char j=97;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
