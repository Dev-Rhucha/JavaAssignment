package Sep11;

public class Array3D {

	public static void main(String[] args) {

		int a[][][] = { { { 3, 4 }, { 1, 2, 3 }, { 3, } }, { { 4, 6, 7 }, { 2, 3 } }, { { 4, 5, 5 }, { 6, 3, 4 } } };

		int sum = 0;

		for (int[][] block : a) {
			for (int[] row : block) {
				for (int val : row) {
					sum += val;
				}
			}

		}
		System.out.println(sum);
	}
}
