package Sep1;

public class StarPrinting {

	public static void main(String[] args) {

		int n = 3;
		int r=2;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");

			}
			
		
			System.out.println();
		}
		
		
		for (int i = 1; i <= r; i++) {

			for (int j = 1; j <=(r-i)+1; j++) {

				System.out.print("* ");

			}
			
		
			System.out.println();
		}
	}
}
