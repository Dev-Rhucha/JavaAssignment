package Array;

public class MaxElementFromArray {

	public static void main(String[] args) {

		int arr[]= {23,34,74,28,89,29,36,99};
		
		int max=arr[0];
		for(int x:arr)
		{
			if(x>max)
			{
				max=x;
			}
		}
		
		System.out.println("max element is :"+max);
	}

}
