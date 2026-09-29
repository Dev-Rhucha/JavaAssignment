package PatternPrinting;

public class PalindromeNumCheck {

	public static void main(String[] args) {

		int num = 121;
		int n=0;
		num=n;
		int rev = 0;

		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		
		
		if (rev==n) {
			System.out.println("num is palindrome");
		} else {
			System.out.println("num is not palindrome");
		}

	}

}
