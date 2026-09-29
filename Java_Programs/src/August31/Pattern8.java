package August31;

public class Pattern8 {

	public static void main(String[] args) {
		
		int n=9;
		//int end =9;
		
		for(int i=3;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			break;
		}
		
		System.out.println();
		
		for(int i=6;i<=n;i++)
		{
			for(int j=4;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			break;
		}
		
System.out.println();
		
		for(int i=9;i<=n;i++)
		{
			for(int j=7;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			break;
		}

	}

}
