package ArrayPractice;

public class Second_Smallest_Element {

	public static void main(String[] args) {
		
		int[] arr = { 34,12, 45, 56, 83, 3,2 ,89 };
		
		int min=arr[0];
		
		for(int x:arr)
		{
		if(x<min)
		{
		     min=x;
		}
		
		}
		
		int secmin=arr[0];
		System.out.println(min);
		
		for(int x:arr)
		{
			if(x==min)
			{
				continue;
				
			}
			else if(x<secmin)
			{
				secmin=x;
			}
			
		}
System.out.println(secmin);
	}

}
