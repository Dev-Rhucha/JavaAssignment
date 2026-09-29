package Array;

import java.util.Scanner;

public class basicArrayPrograms {

	public static void main(String[] args) {

	
//		int arr[]= {2,4,5,6,7};
//		
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			System.out.println(arr[i]);
//
//		}
		int arr[];
        arr=new int[5];
          Scanner sc=new Scanner(System.in);
          for(int j=0;j<=arr.length-1;j++)
          {
        	  
          System.out.println("give value for Array:");
           arr[j]=sc.nextInt();
          }
    	  System.out.print("arr="+"[");
          for(int x:arr)
          {
        	  
        	  System.out.print(" "+x+" ");
        	  
          }
          System.out.print("]");
		sc.close();
	}

}
