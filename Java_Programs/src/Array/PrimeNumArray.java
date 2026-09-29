package Array;

public class PrimeNumArray {

	public static void main(String[] args) {
	
		int[] arr = {5, 2, 8, 1, 4,3,6,7,97,197,49,43,57,23,41,59,90,29,997};
		
		for(int j=0;j<=arr.length-1;j++)
		{
			int count=0;
			for(int i=1;i<=10;i++)
			{
				if(arr[j]%i==0)
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[j]);
			}
		}
		

//		if(count==2)
//		{
//			System.out.println(arr[j]);
//		}

	}

}
