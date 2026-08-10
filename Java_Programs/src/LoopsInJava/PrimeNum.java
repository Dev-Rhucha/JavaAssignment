package LoopsInJava;

public class PrimeNum {

	public static void main(String[] args) {
//		int count = 0;
//		int n=50;
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//
//        if (count == 2) {
//            System.out.println(n + " is a Prime Number");
//        } else {
//            System.out.println(n + " is Not a Prime Number");
//        }


        for (int n = 1; n <= 100; n++) {

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(n + " ");
            }
        }
        
	}

}
