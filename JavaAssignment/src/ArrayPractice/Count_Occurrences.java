package ArrayPractice;

public class Count_Occurrences {

	public static void main(String[] args) {
	
		int[] arr = { 34,12, 45,12, 56, 83, 3,2 ,3,89 ,3};
		
		
		for(int x:arr)
		{
			int count=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(x==arr[i])
				{
				count++;	
				}
				
				
			}
			
			System.out.println("count of "+x+"is:"+count);
		}


		

	}

}
