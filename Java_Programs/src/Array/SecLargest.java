package Array;

public class SecLargest {

	public static void main(String[] args) {

		int arr[] = { 23, 34, 74, 28, 89, 29, 36, 99 };

		int max = arr[0];
		int max2 = arr[0];
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}

		for (int y : arr) {
			if (y == max) {
				continue;
			}

			if (max2 < y) {
				max2 = y;
			}
		}

		System.out.println("max element is :" + max);
		System.out.println("Second max element is :" + max2);

	}

}
