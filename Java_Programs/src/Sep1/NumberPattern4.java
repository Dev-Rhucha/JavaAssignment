package Sep1;

public class NumberPattern4 {

	public static void main(String[] args) {
	
		int n = 3175;

        while (n > 0) {

            int rem = n % 10;
            n = n / 10;

            for (int i = 0; i < rem; i++) {
                System.out.print(rem + " ");
            }

            System.out.println();
        }
				
				
				

	}

}
