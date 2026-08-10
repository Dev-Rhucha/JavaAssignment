package PatternPrinting;

public class InvertedHollowPyramid {

	public static void main(String[] args) {

		int n = 5;
		for (int r = 1; r <= n; r++) {
			for (int col = 1; col <= r; col++) {
				System.out.print("  ");
			}

			for (int col = 1; col <= 2 * n - 2 * r - 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
