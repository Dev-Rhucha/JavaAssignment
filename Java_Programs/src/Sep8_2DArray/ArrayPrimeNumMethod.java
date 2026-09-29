package Sep8_2DArray;

public class ArrayPrimeNumMethod {

	
	
	public static void checkPrime()
	{
		
		int arr[]= {23,45,3,67,5,79,11,35,23,57,97};
		System.out.println("prime numbers from array:");
		for(int x:arr)
		{
			int count=0;
			for(int i=1;i<=100;i++)
			{
				
				if(x%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				
		System.out.println(x);
			}
		}

	}
	public static void main(String[] args) {
		
		
		
		checkPrime();
		
	}

}
