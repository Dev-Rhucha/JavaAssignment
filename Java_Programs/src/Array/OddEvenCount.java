package Array;

public class OddEvenCount {

	public static void main(String[] args) {
		

		int arr[] = { 3, 4, 5, 34, 86, 67,98,56,67,80 };
		int count=0;
		int count2=0;

		for(int x:arr)
		{
			if(x%2==0)
			{
				System.out.println("even numbers from array:"+x);
				count++;
			}
			
			if(x%2==1)
			{
				System.out.println("odd numbers are:"+x);
				count2++;
			}
		}
		
		System.out.println("total even numbers are:"+count);
		System.out.println("total odd numbers are:"+count2);

		int sum=count+count2;
		System.out.println(sum);
	}

}
