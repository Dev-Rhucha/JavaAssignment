package Sep1;

public class RevNumberPrinting {

	public static void main(String[] args) {
		

        int n = 3175;
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reverse number: " + rev);

        // Print digits according to their value
        while (rev > 0) {

            int rem = rev % 10;

            for (int i = 0; i < rem; i++) {
                System.out.print(rem + " ");
            }

            System.out.println();

            rev = rev / 10;
        }

	}

}
