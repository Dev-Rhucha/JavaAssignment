
public class PalindromeCheck {

	public static void main(String[] args) {

		int num = 121;

		int reversenum = 0;

		int copynum = num;

		while (num != 0)

		{
			int digit = num % 10;

			reversenum = reversenum * 10 + digit;
			num = num / 10;

		}

		
		if(reversenum==copynum)
		{
			System.out.println("Number is palindrome");
		}
		
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
