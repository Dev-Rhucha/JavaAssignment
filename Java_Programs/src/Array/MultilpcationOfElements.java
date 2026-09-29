package Array;

public class MultilpcationOfElements {
	public static void main(String []args)
	{
		int arr[]= {3,5,2,10};
		
		int mul=1;
		
		for(int x:arr)
		{
			mul=x*mul;
		}
		System.out.println(mul);
	}

	}


