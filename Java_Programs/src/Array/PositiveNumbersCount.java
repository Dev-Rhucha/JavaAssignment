package Array;

public class PositiveNumbersCount {

	public static void main(String[] args) {
		
		int arr[] = { -3, 4, -5, 34, 86, 67,-98,56,67,-80 };
		int count=0;
		for(int x:arr)
		{
			if(x>0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
