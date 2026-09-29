package Array;



public class DuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 4, 6, 5, 7, 8 };
     
		
         
         for(int i=0;i<=arr.length-1;i++)
         {
        	 for(int j=0;j<=arr.length-1;j++)
        	 {
        		 if(arr[i]==arr[j])
        		 {
       System.out.println(arr[j]);
        		 }
        	 }
         }
			}

		

	}


