package Array;

public class EvenOddArray {

	public static void main(String[] args) {

		
		int []arr= {3,4,6,7,5,8};
		int []even= new int [arr.length];
		int k=0;
		int j=0;
		
		int[] odd=new int[arr.length];
		for(int x:arr)
		{
			if(x%2==0)
			{
				even[k]=x;
				k++;
			}
			
			else if(x%2==1)
			{
				odd[j]=x;
				j++;
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.print(even[i]);
		}
		
		System.out.println();
		for(int l=0;l<j;l++)
		{
			System.out.print(odd[l]);
		}
	}

}
