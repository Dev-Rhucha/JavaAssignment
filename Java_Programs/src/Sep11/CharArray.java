package Sep11;

public class CharArray {

	public static void main(String[] args) {
		
		
		char [] arr= {'v','b','c','a','n','i'};
		
		System.out.println("Elements are :");
		for(char x:arr)
		{
			
			System.out.println(x);
			
			if(x=='a'||x=='e'||x=='o'||x=='u'||x=='i')
			{
				System.out.println("vowels are :"+x);
			}
			
			
		}
	}

}
