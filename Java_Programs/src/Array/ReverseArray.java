package Array;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 34, 86, 67, 98, 56, 67, 80 };

		int length = arr.length;

		for (int i = length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
