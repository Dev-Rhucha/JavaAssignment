package PatternPrinting;

public class CharPattern2 {

	public static void main(String[] args) {
		
		int n=65;
		
		for(char i=69;i>=n;i--)
		{
			for(char j=69;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
