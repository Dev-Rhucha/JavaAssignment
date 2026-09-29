package Sep15_arraylist;

import java.util.ArrayList;

public class SecondLargestNum {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();

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

		int max = al.get(0);
		int secmax = al.get(0);
		int secsmall = al.get(0);

		int secnummax = secmax;
		int secnummin = secsmall;
		int min = al.get(0);

		int minnum = min;

		int maxnum = max;

		for (Integer i : al) {
			if (i > maxnum) {
				maxnum = i;
			}

		}

		for (Integer i : al) {
			if (i != maxnum) {
				if (i > secnummax) {
					secnummax = i;
				}
			}
		}

		for (Integer i : al) {
			if (i < minnum) {
				minnum = i;
			}
		}

		for (Integer i : al) {
			if (i != minnum) {
				if (i < secnummin) {
					secnummin = i;
				}
			}
		}
		System.out.println(maxnum);
		System.out.println(minnum);
		System.out.println(secnummax);

		System.out.println(secnummin);
		System.out.println("sum of smallest and largest:" + (maxnum + minnum));
		
		

	}

}
