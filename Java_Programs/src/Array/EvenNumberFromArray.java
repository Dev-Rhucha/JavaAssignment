package Array;

public class EvenNumberFromArray {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 34, 86, 67,98,56,67,80 };
		int count=0;

		for(int x:arr)
		{
			if(x%2==0)
			{
				System.out.println("even numbers from array:"+x);
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
