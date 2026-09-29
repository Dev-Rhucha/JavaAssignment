package Sep15_arraylist;

import java.util.ArrayList;

public class SimpleArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		int evensum = 0;
		int oddsum = 0;

		al.add(34);
		al.add(35);
		al.add(58);
		al.add(90);
		al.add(-84);
		al.add(84);
		al.add(39);
		al.add(0);
		al.add(-20);
		al.add(41);

		for (Integer i : al) {
			if (i % 2 == 0) {
				evensum = evensum + i;

			}

			else if (i % 2 == 1) {
				oddsum = oddsum + i;
			}

			System.out.println();
		}

		// sum of all
		int sum = 0;
		for (Integer i : al) {
			sum = sum + i;

		}
		System.out.println("sum of all elements :" + sum);
		System.out.println("sum of even numbers:" + evensum);
		System.out.println("sum of odd numbers:" + oddsum);

	}

}
