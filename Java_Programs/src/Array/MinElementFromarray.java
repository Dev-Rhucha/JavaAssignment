package Array;

public class MinElementFromarray {

	public static void main(String[] args) {

		int arr[]= {34,23,56,12,39,70};
		
		int min=arr[0];
		
		for(int x:arr)
		{
			if(x<min)
			{
				min=x;
			}
		}
		System.out.println("minimum element is :"+min);
	}

}
