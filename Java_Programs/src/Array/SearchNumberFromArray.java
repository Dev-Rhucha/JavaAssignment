package Array;

public class SearchNumberFromArray {

	public static void main(String[] args) {
	
		
		int arr[] = { -3, 4, -5, 34, 86, 67,-98,56,67,-80 };
		
		int num=67;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==num)
			{
				System.out.println(i);
			}
		}

	}

}
