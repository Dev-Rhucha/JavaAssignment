package ArrayPractice;

public class print_All_Elements {

	public static void main(String[] args) {

		int[] arr = { 34, 45, 56, 83, 3, 89 };
		System.out.print("{");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.print("}");
	}

}
