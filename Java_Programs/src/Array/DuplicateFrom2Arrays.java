package Array;

public class DuplicateFrom2Arrays {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 3, 5, 6, 7, 8, 9 };
		
		int []arr3= new int [6];
		int k=0;

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr[i] == arr2[j]) {
					
					arr3[k]=arr2[j];
					k++;
					
					
					//System.out.println(arr2[j]);
				}
			}
		}
		
		
		for( int i=0;i<k;i++)
		{
			System.out.println(arr[i]);
		}
		


	}

}
