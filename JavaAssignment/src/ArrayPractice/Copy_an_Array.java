package ArrayPractice;

public class Copy_an_Array {

	public static void main(String[] args) {

		int[] arr = { 34, 45, 56, 83, 3, 89 };
		
		int []arr2= new int [arr.length] ;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				arr2[j]=arr[i];
				System.out.println(arr2[j]);
				break;
			}
			
		}
	}

}
