package Array;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		
		
		int arr[] = { 3, 4, 5, 34, 86, 67,98,56,67,80 };
		int count=0;
		int sum=0;
		
		for(int x:arr)
		{
			sum=sum+x;
			count++;
			
			
		}
		
		int avg=sum/count;
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);
	}

}
