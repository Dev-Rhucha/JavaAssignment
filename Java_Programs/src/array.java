
public class array {

	public static void main(String[] args) {
		
		
		int []arr= {34,5,6,57,78,39,90,60};
		
		int max=arr[0];
		int max2=arr[0];
		
		for(int x:arr)
		{
			if(x>max)
			{
				max=x;
			}
		}
		
		for(int y:arr)
		{
			if(y==max)
			{
				continue;
			}
			
			if(max2<y)
			{
				max2=y;
			}
		}

		System.out.println(max);
		System.out.println(max2);
	}

}
