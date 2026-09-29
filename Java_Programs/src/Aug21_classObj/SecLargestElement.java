package Aug21_classObj;

public class SecLargestElement {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 34, 86, 67,98 };

		int length = arr.length;

		int max = arr[0];
		int max2 = arr[0];

		for (int i = 0; i < length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		for (int j = 0; j < length; j++) {
			if (arr[j] == max) {
				continue;
			}

			if (max2 < arr[j]) {
				max2 = arr[j];
			}
		}

		System.out.println(max);
		System.out.println(max2);

//		
//		

	}

}
