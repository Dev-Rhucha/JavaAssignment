package Array;

public class MissingNumber {

	public static void main(String[] args) {
 
//		int[] arr = { 1, 2,3, 4, 5,6, 7, 8,9,10,11,13 };
//		int j = 1;
//
//		for (int x : arr) {
//
//			if (j != x) {
//				System.out.println(j);
//				break;
//			}
//
//			j++;
//		}
//		
//		
		int[] arr = {1, 2, 4, 5, 6, 7, 8,10};

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] != 1) {

                System.out.println("Missing number is: " + (arr[i] + 1));
            }
        }
	}

}
