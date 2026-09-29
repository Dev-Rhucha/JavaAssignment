package ArrayPractice;

public class Print_Elements_in_Reverse {

	public static void main(String[] args) {
	
		
		int[] arr = { 34, 45, 56, 83, 3, 89 };
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
