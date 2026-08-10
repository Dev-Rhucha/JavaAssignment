package LoopsInJava;

public class PracticeForLoop {

	public static void main(String[] args) {

		
		for(int i=1;i<=20;i+=2)
		{
			System.out.print(" " +i);
		}
		
		System.out.println();
		for(int i=5;i<=50;i+=5)
		{
			System.out.print(" "+i);
		}
		
		System.out.println();
		for(int i=5;i<=100;i+=10)
		{
			System.out.print(" "+i);
		}
		
		System.out.println();
		
		int n=4;
		int num=0;
		for(int r=1;r<=n;r++)
		{
//			
			
			for(int c=1;c<=r;c++)
			{
				 num = num * 10 + 1;
				    System.out.print(num + " ");
				//System.out.print("1");
			}
			System.out.print(" ");
		}
		
		
		
	}

}
